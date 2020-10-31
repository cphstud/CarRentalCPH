package domain;

import java.util.List;

public interface OrderFactory {
    void createOrder(OrderService orderService);
    List<Order> getAllOrders();
}
