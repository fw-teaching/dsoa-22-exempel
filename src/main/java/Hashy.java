public class Hashy {
    
    private int size;
    private Person[] hashTable;

    public Hashy(int size) {
        this.size = size*10;
        this.hashTable = new Person[this.size];
    }

    int hashCode(String key) {
        int sum = 0;

        for (int i = 0; i < key.length(); i++) {
            sum += ((int) key.charAt(i)) * 10;
        }

        return sum % size;
    }

    public void insert(Person person) {
        int index = hashCode(person.getName());

        // Om platsen är upptagen
        while (hashTable[index] != null) {
            index++;

            // börja pånytt från början om vi går förbi sista,
            // cirkulär array
            index = index % size;
        }

        // vi har hittat en tom plats!
        hashTable[index] = person;
    }

    public void search(String name) {
        int index = hashCode(name);

        int ops = 1;

        while (!hashTable[index].getName().equals(name)) {
            index++;
            // cirkulär array
            index = index % size;

            ops++;
       }
       System.out.println("HASH  search "  + hashTable[index].getRanking() + ", operations:" + ops );
    }

    public void searchStandarArray(String needle, Person[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i].getName().equals(needle)) {
                System.out.println("ARRAY search " 
                     + haystack[i].getRanking() + " operations:" + i);
            }
        }
    }

}
