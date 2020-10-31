package infrastructure;

import domain.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DatabaseTest {
    List<Car> orderItems;
    Customer customer;
    Database database;
    String filename;
    Order order;
    Invoice invoice,invoice2;
    Car car1,car2;

    @Before
    public void setup() {
        filename = "resources/ordersDone.csv";
        Double price = 3441.50;
        String location = "Kastrup";
        orderItems = new ArrayList<>();
        customer = new Customer(31202098);
        invoice = new Invoice("$30,366");
        car1 = new Car(11,"Audi","A4 3.0 Quattro 4dr manual",invoice,17,26);
        invoice2 = new Invoice("$33,766");
        car2 = new Car(11,"Volvo","V70 5dr manual",invoice2,13,21);
        orderItems.add(car1);
        orderItems.add(car2);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm");
        LocalDateTime bookTime = LocalDateTime.now();
        String orderTime = LocalDateTime.now().format(df);
        String pickupTime = LocalDateTime.now().withHour(10).withMinute(0).format(df);
        String dropTime = LocalDateTime.now().plusDays(10).withHour(10).withMinute(0).format(df);

        order = new Order(orderTime,customer,orderItems,location,pickupTime,dropTime,false,price);
        order.setId(23);
        database = new DatabaseToFile(filename);
    }
    @Test
    public void saveOrderToDBTest() {
        int newOrderId = 0;
        try {
            newOrderId = database.saveOrder(order);
        } catch (NoSuchDBException e) {
            e.getMessage();
        }
        int expected = 1;
        int actual = newOrderId;
        assertEquals(expected,actual);
    }

}