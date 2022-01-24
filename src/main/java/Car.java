import javax.xml.stream.events.Characters;
import java.awt.*;
import java.io.Serializable;
import java.util.Random;

public class Car extends Vehicle implements Serializable {

    // Använd Random() för att få slumptal
    Random rnd = new Random();
    Propulsion propulsion;

    // Konstruktor
    public Car(String name, Propulsion propulsion) {
        super(name);
        this.propulsion = propulsion;
    }
    public Car(String name) {
        super(name); // "super" är samma sak som "this", men gäller superklassen
        propulsion = Propulsion.COMBUSTION;
    }

    // Statisk factory-metod
    public static Car createRandomCar() {
        Random rnd = new Random();
        String[] brands = { "Skoda", "Volvo", "Nissan", "Kia", "Audi" };
        Car retCar = new Car(brands[rnd.nextInt(brands.length)]);
        retCar.mileage = rnd.nextInt(9000)+1000;
        return retCar;
    }

    // switch för att göra olika saker beroende på enum
    public int getEfficiency() {
        int ret;

        switch (propulsion) {
            case COMBUSTION:
                ret = 20;
                break;
            case HYBRID:
                ret = 50;
                break;
            case ELECTRIC:
                ret = 90;
                break;
            default:
                ret = 0;
        }
        return ret;
    }

    // Kom ihåg att return avbryter en metod, så om vi inte har något
    // desto mer komplicerat vi vill göra kan vi sköta det hela väldigt
    // kort och kraftigt så här:
    public int getEfficiency2() {
        switch (propulsion) {
            case COMBUSTION: return 20;
            case HYBRID: return 50;
            case ELECTRIC: return 90;
            default: return 0;
        }
    }

    // Också if-satser funkar utan klamrar om man bara har en statement per if
    public int getEfficiency3() {
        if (propulsion == Propulsion.COMBUSTION) return 20;
        if (propulsion == Propulsion.HYBRID) return 50;
        if (propulsion == Propulsion.ELECTRIC) return 90;
        return 0; // så här långt borde vi aldrig komma!
    }

    public Propulsion getPropulsion() {
        return propulsion;
    }
}
