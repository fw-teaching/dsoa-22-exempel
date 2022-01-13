import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner med System.in läser input från konsolen
        Scanner console = new Scanner(System.in);

        System.out.println("Hello Java!");

        Vehicle car = new Car("VW");

        Vehicle bike = new Bike("PlanetX", "fixie");
        Vehicle otherBike = new Bike("Jopo");

        Vehicle todaysVehicle = bike;

        int loopCount = 3;
        String userInput;
        while (loopCount > 0) {

            System.out.println(loopCount);
            // System.out.println("My car is a " + car.getName());
            System.out.println("My bike is a " + bike.getName());
            //System.out.println("other bike: " + otherBike.getName());
            System.out.println("Today i used my " + todaysVehicle.getName());

            System.out.println("Enter to continue, q to quit:");

            userInput = console.nextLine();
            if (userInput.equals("q")) {
                System.out.println("Bye!");
                break;
            }

            loopCount--;

        }

        // Stäng scanner-objektet!
        console.close();
    }
}
