import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Garage garage;

        garage = (Garage) FileUtils.loadObject("garage.save");
        if (garage == null) {
            garage = new Garage();
        }

        garage.addCar(new Car("Tesla", Propulsion.ELECTRIC));
        garage.addCar(new Car("Prius", Propulsion.HYBRID));

        String fileText = "Morjens!!!";
        FileUtils.writeTextFile("file.txt", fileText);
        System.out.println(FileUtils.readTextFile("file.txt"));

        while(true) {

            // Skriv ut garagets innehåll
            for (int i = 0; i < garage.getInventory().size(); i++) {
                System.out.printf(" %d - %s %s (%s km) (efficiency: %d %%)\n",
                        i,
                        garage.getInventory().get(i).getName(),
                        garage.getInventory().get(i).getPropulsion(),
                        garage.getInventory().get(i).getMileage(),
                        garage.getInventory().get(i).getEfficiency());
            }

            // Programmet meny
            System.out.println("Lägg till en ny bil (a), Radera bil (r) eller avsluta (q)");
            String userInput = scanner.nextLine();

            if (userInput.equals("q")) {
                break;
            } else if (userInput.equals("r")) {

                System.out.printf("Skriv bilens nummer (0-%d) för att radera: ", garage.getInventory().size()-1);

                // Felhantering med try/catch
                try {
                    // Vi testar detta:
                    garage.getInventory().remove(Integer.parseInt(scanner.nextLine()));
                } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    // Specifikt felmeddelande
                    System.out.printf("Du måste ge ett heltal mellan 0-%d!\n", garage.getInventory().size()-1);
                } catch (Exception e) {
                    // Specifikt felmeddelande
                    System.out.println(e);
                }


            } else if (userInput.equals("a")) {
                // Vi skapar ett Car-objekt med vår statiska factory-metod
                garage.addCar(Car.createRandomCar());
            }

        }

        FileUtils.saveObject("garage.save", garage);

        scanner.close();


        /*
        * Exempel på hur vi kan använda vår statiska Utils.isInt()-metod:
        *

        if (Utils.isInt(scanner.nextLine())) {
            System.out.println("Du skrev ett heltal!");
        } else {
            System.out.println("Inte ett heltal!");
        }*/

    }
}
