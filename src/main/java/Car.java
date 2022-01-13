public class Car extends Vehicle {

    int mileage;

    // Konstruktor
    public Car(String name) {
        super(name); // "super" är samma sak som "this", men gäller superklassen
    }

    @Override
    String getAdditionalInfo() {
        return String.format("%d km", mileage);
    }

}
