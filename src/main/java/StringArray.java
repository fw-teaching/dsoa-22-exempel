import java.util.Arrays;

public class StringArray {

    /** klass med utökade array-egenskaper (hemgjord ArrayList, typ...)
     *
     */

    String[] values;

    public StringArray(String[] values) {
        this.values = values;
    }

    public void add(String value) {
        // Skapa ny array som är ett element längre
        String[] newValues = new String[values.length+1];

        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        newValues[values.length] = value;
        values = newValues;

        System.out.println(" ----- add(), operationer: " + values.length);

    }

    public void add(int index, String value) {
        // Lägg till ett värde på en specifik plats
       // 1.  öka arrayns storlek
        add(null);
        // 2. flytta alla värden ett steg
        for (int i = values.length-1; i > index; i--) {
            values[i] = values[i-1];
        }
        // 3. placera in vårt nya värde på rätt ställe
        values[index] = value;
        System.out.println(" ----- add2, operationer: " + (values.length-index));
    }


    public String toString() {
        return Arrays.toString(values);
    }

}
