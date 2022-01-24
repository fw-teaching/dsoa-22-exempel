import java.io.Serializable;
import java.util.ArrayList;

public class Garage implements Serializable {

    private ArrayList<Car> inventory = new ArrayList<>();

    // Transient-attribut lämnas bort när objektet serialiseras.
    private transient String iWillNotBeSaved = "foo";

    private String somethingNew;

    public Garage() {
        inventory.add(Car.createRandomCar());
        somethingNew = "1";
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(car);
    }
}
