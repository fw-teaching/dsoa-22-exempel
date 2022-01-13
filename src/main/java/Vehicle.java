abstract class Vehicle {

    private String name; // Instansvariabel

    public Vehicle(String name) {
        this.name = name;
    }

    abstract String getAdditionalInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
