import java.util.ArrayList;

public class Fleet {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void print() {
        for (Car car : cars) {
            System.out.println(car.getModel());
            System.out.println(car.getPrice());
            System.out.println("------------");
        }
    }
}
