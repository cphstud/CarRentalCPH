package domain;

import java.util.List;

public interface CarRepository {
    List<Car> findAllCars() throws NoSuchCarException;
    Car findCarById(int id) throws NoSuchCarException;
}
