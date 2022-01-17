import java.util.Scanner;

public class Main {

    // Konstant
    static final double APP_VERSION = 1.0;

    public static void main(String[] args) {

        System.out.println("App version " + APP_VERSION);

        // Scanner med System.in läser input från konsolen
        // Skilda objekt för att ta emot int och string för att undvika error
        Scanner consoleStr = new Scanner(System.in);
        Scanner consoleInt = new Scanner(System.in);

        // Man kan deklarera variabler av samma typ flera på en gång
        Vehicle car, car2;

        // ArrayList-exempel:
        Garage garage = new Garage();
        garage.addCar(new Car("Fiat"));

        System.out.println("Bilar i garaget:");
        for (int i = 0; i < garage.getInventory().size(); i++) {
            System.out.printf("%d - %s\n", i, garage.getInventory().get(i).getName());
        }
        System.out.println("Vilken bil vill du köra? ");
        car = garage.getInventory().get(consoleInt.nextInt());
        System.out.println("Du valde: " + car.getName() + "\n----\n");

        // HashMap-exempel:
        Garage2 garage2 = new Garage2();
        System.out.println("Bilar i vårt andra garage:");
        for (String key: garage2.getInventory().keySet()) {
            System.out.printf("%s - %s\n", key, garage2.getInventory().get(key).getName());
        }
        System.out.println("Vilken bil vill du köra? ");
        car2 = garage2.getInventory().get(consoleStr.nextLine());
        System.out.println("Du valde: " + car2.getName() + "\n----\n");


        // Arrays:
        String[] carBrands = { "Tesla", "VW", "Toyota" };
        int[] myNumbers = { 2, 4, 8 };
        System.out.println("Car brands:");
        for (int i = 0; i < carBrands.length; i++) {
            System.out.println(carBrands[i]);
        }

        // Klassvariabler
        System.out.println("tot cars: " + car.getSubObjectCount());
        System.out.println("tot vehicles: " + Vehicle.getVehicleCounter());

        // Skriv inte ut saker i andra klasser än den som används för UI (Main i det här fallet)
        // rätt (vi använder main för UI):
        System.out.println(car.getAdditionalInfo());
        // Fel: inga direkta utskrifter i logikklasserna!
        car2.getAdditionalInfo2();

        consoleInt.close();
        consoleStr.close();
    }
}
