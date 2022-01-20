public class Bike extends Vehicle {

    private String bikeType = "normal";

    public Bike(String name, String bikeType) {
        super(name);
        this.bikeType = bikeType;
    }
    public Bike(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return String.format("%s (%s)",
                super.getName(),
                bikeType);
    }
}
