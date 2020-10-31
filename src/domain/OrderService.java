package domain;

import java.time.LocalDate;

public interface OrderService {
    LocalDate getPickupDate();
    double getTotalPrice();
    void addItemToOrder(Car car);
    boolean isArchived();

}
