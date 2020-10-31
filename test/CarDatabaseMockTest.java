import domain.Car;
import domain.CarRepository;
import domain.NoSuchCarException;
import infrastructure.CarDatabaseMock;
import org.junit.Test;

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