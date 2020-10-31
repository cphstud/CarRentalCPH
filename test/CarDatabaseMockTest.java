import org.junit.Test;

import static org.junit.Assert.*;

public class CarDatabaseMockTest {
    Car car;

    @Test(expected = NoSuchCarException.class)
    public void findCarById() {
        CarRepository carDatabaseMock = new CarDatabaseMock();
        try {
            car = carDatabaseMock.findCarById(8);
        } catch (NoSuchCarException e) {
            e.printStackTrace();
        }
        System.out.println(car.toString());
    }
}