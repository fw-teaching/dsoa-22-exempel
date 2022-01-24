import javax.xml.stream.events.Characters;
import java.awt.*;
import java.io.Serializable;
import java.util.Random;

public class Car extends Vehicle implements Serializable {

    // Använd Random() för att få slumptal
    Random rnd = new Random();

    // Konstruktor
    public Car(String name) {
        super(name); // "super" är samma sak som "this", men gäller superklassen
        mileage = rnd.nextInt(9000)+1000;
    }

    // Statisk factory-metod
    public static Car createRandomCar() {
        Random rnd = new Random();
        String[] brands = { "Skoda", "Volvo", "Nissan", "Kia", "Audi" };
        return new Car(brands[rnd.nextInt(brands.length)]);
    }


}
