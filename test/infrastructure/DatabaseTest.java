package infrastructure;

import domain.Order;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseTest {
    Database database;
    String filename;
    Order order;
    @Before
    public void setup() {
        order = new Order();
        database = new DatabaseToFile();
    }
    @Test
    public void saveOrderToDBTest() {
        int newOrderId = database.saveOrder(order);
        int expected = 1;
        int actual = newOrderId;
        assertEquals(expected,actual);
    }

}