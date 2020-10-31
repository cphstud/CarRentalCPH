package infrastructure;

import domain.Order;

public interface Database {
    int saveOrder(Order order);


}
