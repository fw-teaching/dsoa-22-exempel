import java.util.Scanner;

public class Main {

    // Konstant
    static final double APP_VERSION = 1.0;

    public static void main(String[] args) {

        // Scanner med System.in läser input från konsolen
        Scanner console = new Scanner(System.in);

        System.out.println("App version " + APP_VERSION);

        Vehicle car, car2;

        car = new Car("VW");
        car2 = new Car("Toyota");

        Vehicle bike = new Bike("PlanetX", "fixie");
        Vehicle otherBike = new Bike("Jopo");

        System.out.println("tot cars: " + car.getSubObjectCount());
        System.out.println("tot vehicles: " + Vehicle.getVehicleCounter());
        System.out.println("tot bikes: " + bike.getSubObjectCount());

        // rätt:
        System.out.println(car.getAdditionalInfo());
        // fel:
        car2.getAdditionalInfo2();

        Vehicle myCar;
        String[] carBrands = { "Tesla", "VW", "Toyota" };
        int[] myNumbers = { 2, 4, 8 };

        int i = 0;
        String userInput;
        while (true) {

            myCar = new Car(carBrands[i]);

            // System.out.println("My car is a " + car.getName());
            System.out.println("My car is a " + myCar.getName());

            System.out.println("Enter to continue, q to quit:");

            userInput = console.nextLine();
            if (userInput.equals("q")) {
                System.out.println("Bye!");
                break;
            }

            i++;

        }

        // Stäng scanner-objektet!
        console.close();
    }
}
