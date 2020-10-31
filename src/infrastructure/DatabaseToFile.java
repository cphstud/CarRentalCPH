package infrastructure;

import domain.Order;

public class DatabaseToFile implements Database{
    @Override
    public int saveOrder(Order order) {
        return 0;
    }
}
