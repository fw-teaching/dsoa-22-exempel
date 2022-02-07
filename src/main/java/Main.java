import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Main {

    // Konstant
    static final double APP_VERSION = 1.0;

    public static void main(String[] args) {


        Person[] standardArray = new Person[Utils.TOP_MALE_NAMES.length];
        Hashy hashy = new Hashy(Utils.TOP_MALE_NAMES.length);

        for (int i = 0; i < standardArray.length; i++) {

            standardArray[i] = new Person(Utils.TOP_MALE_NAMES[i], i);
            hashy.insert(new Person(Utils.TOP_MALE_NAMES[i], i));
        }

        hashy.searchStandarArray("Watson", standardArray);
        hashy.search("Watson");
        hashy.searchStandarArray("Liam", standardArray);
        hashy.search("Liam");
        hashy.searchStandarArray("Marshall", standardArray);
        hashy.search("Marshall");
        hashy.searchStandarArray("Donald", standardArray);
        hashy.search("Donald");

        //System.out.println(hashy.hashCode("foo"));

    }
}
