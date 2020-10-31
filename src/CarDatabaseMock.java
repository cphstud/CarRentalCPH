import java.util.ArrayList;
import java.util.List;

public class CarDatabaseMock implements CarRepository{
    private List<Car> cars = null;

    public CarDatabaseMock() {
        if (cars == null)  {
            cars = new ArrayList<>();
            initCars();
        }
    }

    private void initCars() {
        Invoice invoice = new Invoice("$23,345");
        Invoice invoice2 = new Invoice("$29,345");
        int[] limits = new int[]{0, 5, 10, 15, 20};
        int[] prices = new int[]{10470, 5500, 2340, 1050, 330};
        Taxes taxes = new Taxes("benzin",toList(prices),toList(limits),1000);
        Car car = new Car(taxes, 0,"Audi","A4 3.0 Quattro 4dr manual",invoice,17,26);
        Car car2 = new Car(taxes, 1,"Audi","A6",invoice,13,20);
        cars.add(car);
        cars.add(car2);
    }

    @Override
    public List<Car> findAllCars() throws NoSuchCarException{
        return cars;
    }

    @Override
    public Car findCarById(int id) throws NoSuchCarException {
        Car tmpCar = null;
        tmpCar = cars.get(id);
        return tmpCar;
    }

    public List<Integer> toList(int[] ints) {
        List<Integer> intList = new ArrayList<Integer>(ints.length);
        for (int i : ints) {
            intList.add(i);
        }
        return intList;
    }
}
