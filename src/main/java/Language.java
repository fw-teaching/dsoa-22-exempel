import java.util.HashMap;

public class Language {
    String content;
    LangLabel label;

    HashMap<String, Integer> charCount = new HashMap<String,Integer>();
    HashMap<String, Double> charDistribution = new HashMap<String,Double>();

    public Language(String content, LangLabel label) {
        this.content = content;
        this.label = label;

        this.content = this.content.replaceAll("[^\\p{L}]", "").toLowerCase();

        calcCharDistribution();
    }

    private void calcCharDistribution() {

        for (int i = 0; i < content.length(); i++) {
            //System.out.println(content.charAt(i));
            // Konvertera char till String:
            String letter = Character.toString(content.charAt(i));

            if (!charCount.containsKey(letter)) {
                charCount.put(letter, 0);
            }

            charCount.put(letter, charCount.get(letter)+1);

        }

        for (String letter: charCount.keySet()) {

            // Hur stor andel av hela texten är innevarande bokstav (*100 om vi vill ha det i procent)
            Double distr = (double) charCount.getOrDefault(letter, 0) / content.length() * 100;

            charDistribution.put(letter, distr);

            System.out.println(letter + " count: " + charCount.get(letter) + " distribution: " + distr);

        }

    }


}
