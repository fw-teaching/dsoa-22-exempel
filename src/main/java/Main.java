import java.util.Scanner;

public class Main {

    // Konstant
    static final double APP_VERSION = 1.0;

    public static void main(String[] args) {

        // Scanner med System.in läser input från konsolen
        // Skilda objekt för att ta emot int och string för att undvika error
        Scanner consoleStr = new Scanner(System.in);
        Scanner consoleInt = new Scanner(System.in);

        System.out.println("App version " + APP_VERSION);

        Vehicle car, car2;

        Garage garage = new Garage();
        garage.addCar(new Car("Fiat"));

        System.out.println("Bilar i garaget:");
        for (int i = 0; i < garage.getInventory().size(); i++) {
            System.out.printf("%d - %s\n", i, garage.getInventory().get(i).getName());
        }
        System.out.println("Vilken bil vill du köra? ");
        car = garage.getInventory().get(consoleInt.nextInt());
        System.out.println("Du valde: " + car.getName() + "\n----\n");

        Garage2 garage2 = new Garage2();
        System.out.println("Bilar i vårt andra garage:");
        for (String key: garage2.getInventory().keySet()) {
            System.out.printf("%s - %s\n", key, garage2.getInventory().get(key).getName());
        }
        System.out.println("Vilken bil vill du köra? ");
        car2 = garage2.getInventory().get(consoleStr.nextLine());
        System.out.println("Du valde: " + car2.getName() + "\n----\n");


        /*
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


         */

        /* int i = 0;
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

        }*/

        // Stäng scanner-objektet!
        consoleStr.close();
    }
}
