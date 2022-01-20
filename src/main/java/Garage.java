import java.util.ArrayList;

public class Garage {

    private ArrayList<Car> inventory = new ArrayList<>();

    public Garage() {
        inventory.add(Car.createRandomCar());
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(car);
    }
}
