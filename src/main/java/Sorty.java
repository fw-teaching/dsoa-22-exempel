import java.util.Arrays;

public class Sorty {

    private String[] values;

    public Sorty(String[] values) {
        this.values = values.clone();
    }


    public void bubbleSort() {
        int ops = 0;

        int remaining = values.length;
        String temp;
        for (int i = 0; i < values.length; i++) {
            // Loopa paren
            for (int j = 1; j < remaining; j++) {

                if (values[j-1].compareTo(values[j]) > 0) {
                    temp = values[j-1];
                    values[j-1] = values[j];
                    values[j] = temp;
                }
                ops++;
            }
            remaining--;
        }

        System.out.println("--- bubbleSort() " + ops + " operations:");
        System.out.println(Arrays.toString(values));
    }

    public String[] insertionSort() {
        int ops = 0;
        for (int i = 1; i < values.length; i++) {
            String curValue = values[i];

            int j = i-1;
            while (j >= 0 && values[j].compareTo(curValue) > 0) {
                values[j+1] = values[j];
                j--;

                ops++;
            }

            values[j+1] = curValue;

        }

        System.out.println("--- insertionSort() " + ops + " operations:");
        System.out.println(Arrays.toString(values));

        return values;

    }


    public void print() {
        System.out.println(Arrays.toString(values));
    }
}
