abstract class Vehicle {

    // Instansvariabler (kan i vissa fall göras publika (eller protected) om vi vill
    // komma åt dem direkt i subklasser (t.ex mileage här))
    private String name;
    int mileage;

    // Klassvariabel (samma värde för alla instanser)
    static int vehicleCounter = 0;

    public Vehicle(String name) {
        this.name = name;
        vehicleCounter++;
    }

    abstract String getAdditionalInfo();
    abstract int getSubObjectCount();

    public void getAdditionalInfo2() {
        System.out.println("Additional info!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        mileage = 100;
    }

    public static int getVehicleCounter() {
        return vehicleCounter;
    }
}
