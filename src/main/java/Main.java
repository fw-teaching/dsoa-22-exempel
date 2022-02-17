import java.util.HashMap;

public class Main {


    public static void main(String[] args) {


        String text = "Grace Hopper        (född Murray), född den 9 december 1906 i New York, död den 1 januari 1992 i Arlington, Virginia, var en amerikansk dator-pionjär och sjöofficer (flottiljamiral).";

        //text = text.replaceAll("[^a-zA-ZåäöÅÄÖ ]", "");

        // Alla tecken som inte är vanliga unicode-bokstäver eller space
        text = text.replaceAll("[^\\p{L}\s]", "");

        // byt ut en eller flera mellanslag till endast ett mellanslag (+ betyder en eller flera av föregående)
        text = text.replaceAll("\\s+", " ");

        String[] words = text.split(" ");

        for (String word: words) {
            System.out.print("'" + word + "' ");
        }


        HashMap<LangLabel,Language> languages = new HashMap<>();
        System.out.println("\n ---- Loop enum:");
        for (LangLabel label: LangLabel.values()) {
            System.out.println(label);

            String content = FileUtils.readTextFile("assets/lang-samples/" + label + ".txt");

            languages.put(label, new Language(content, label));
        }

    }
}
