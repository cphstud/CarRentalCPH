package domain;

import java.util.ArrayList;
import java.util.List;

public class Order {

    int  id;
    String orderTime;
    Customer customer;
    List<Car> items;
    String location;
    String  pickupTime;
    String  dropTime;
    boolean hasPaid;
    double price;

    public Order(String orderTime, Customer customer, List<Car> items, String location, String pickupTime, String dropTime, boolean hasPaid, double price) {
        this.orderTime = orderTime;
        this.customer = customer;
        this.items = items;
        this.location = location;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
        this.hasPaid = hasPaid;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Car> getItems() {
        return items;
    }

    public String getLocation() {
        return location;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public String getDropTime() {
        return dropTime;
    }

    public boolean isHasPaid() {
        return hasPaid;
    }

    public double getPrice() {
        return price;
    }
}
