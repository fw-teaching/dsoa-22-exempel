import java.util.ArrayList;
import java.util.HashMap;

public class Garage2 {

    private HashMap<String,Car> inventory = new HashMap<>();

    public Garage2() {

        // Det är OK, t.o.m. rekommenderat
        // att använda interna metoder i konstruktorn!
        addCar("bmw", new Car("BMW"));
        addCar("mersu", new Car("Mercedes"));

        // detta går också i simplare case
        inventory.put("opel", new Car("Opel"));
    }

    public HashMap<String,Car> getInventory() {
        return inventory;
    }

    public void addCar(String key, Car car) {
        inventory.put(key, car);
    }
}
