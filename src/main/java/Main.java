import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Main {

    // Konstant
    static final double APP_VERSION = 1.0;

    public static void main(String[] args) {

        String[] unsorted = { "Fili", "Kili", "Balin", "Dwalin", "Ori", "Nori", "Dori", "Gloin", "Oin", "Bifur", "Bofur", "Bombur", "Thorin" };

        /**
         * Sortering av objekt med Comparable och Collections.sort()
         */

        // Vi börjar med att fylla en ArrayList med Person-objekt
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < unsorted.length; i++) {
            persons.add(new Person(unsorted[i], i));
            persons.get(i).setAge((int) (Math.random()*200+50));

            System.out.println(persons.get(i).getName() + " age:" + persons.get(i).getAge());
        }

        // Collections.sort hittar och använder vår compareTo() i Person:
        Collections.sort(persons);

        System.out.println("------ sorted:");
        for (Person person: persons) {
            System.out.println(person.getName() + " age:" + person.getAge());
        }

        /**
         * Bubble Sort och Insertion Sort
         */

        (new Sorty(unsorted)).bubbleSort();
        (new Sorty(unsorted)).insertionSort();

        // sorterad i fallande ordning, båda algoritmerna lika dåliga
        String[] sorted1 = (new Sorty(Utils.TOP_MALE_NAMES)).insertionSort();
        String[] reversed = new String[sorted1.length];
        for (int i = 0; i < sorted1.length; i++) {
            reversed[i] = sorted1[sorted1.length-1-i];
        }

        (new Sorty(reversed)).bubbleSort();
        (new Sorty(reversed)).insertionSort();



        //System.out.println(hashy.hashCode("foo"));

    }
}
