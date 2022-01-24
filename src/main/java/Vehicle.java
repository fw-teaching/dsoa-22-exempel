import java.io.Serializable;

abstract class Vehicle implements Serializable {

    // Instansvariabler (kan i vissa fall göras publika (eller protected) om vi vill
    // komma åt dem direkt i subklasser (t.ex mileage här))
    private String name;
    int mileage;


    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        mileage = 100;
    }

    public Object getMileage() {
        return mileage;
    }
}
