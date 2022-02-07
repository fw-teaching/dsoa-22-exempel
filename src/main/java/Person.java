public class Person {
    private String name;
    private int nameRank;
    
    public Person(String name, int nameRank) {
        this.name = name;
        this.nameRank = nameRank;
    }

    public String getRanking() {
        return name + " is rank " + nameRank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}

