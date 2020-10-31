package infrastructure;

import domain.NoSuchDBException;
import domain.Order;

public interface Database {
    int saveOrder(Order order) throws NoSuchDBException;
}
