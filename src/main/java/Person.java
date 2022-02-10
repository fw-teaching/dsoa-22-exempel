import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {
    private String name;
    private int nameRank;
    private int age;
    
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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // returnera skillnaden så att Collections.sort kan sortera
    @Override
    public int compareTo(Person otherPerson) {
        return age - otherPerson.getAge();
        //return name.compareTo(otherPerson.getName());
    }
}

