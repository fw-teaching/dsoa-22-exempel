public class Player {
    
    private String name;
    private int health;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Ternary
        this.name = (name.equals("Fredde") ? name.toUpperCase() : name);
    }

    public void attack(Player defender) {
    }

    public int getHealth() {
        // traditionell if-sats
        if (health > 0) {
            return health;
        }


        // If-sats på en rad
        if (health > 0) return health;


        // Ternary expression
        return (health > 0) ? health : 0;



    }
}

