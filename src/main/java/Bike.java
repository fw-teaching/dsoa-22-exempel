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
    String getAdditionalInfo() {
        return String.format("Bike type is %s", bikeType);
    }

    @Override
    public String getName() {
        return String.format("%s (%s)",
                super.getName(),
                bikeType);
    }
}
