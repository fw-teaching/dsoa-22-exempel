import java.util.ArrayList;

public class Garage {

    private ArrayList<Car> inventory = new ArrayList<>();

    public Garage() {
        inventory.add(new Car("Tesla"));
        inventory.add(new Car("VW"));

        // Det är OK, t.o.m. rekommenderat
        // att använda interna metoder i konstruktorn!
        addCar(new Car("Toyota"));
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(car);
    }
}
