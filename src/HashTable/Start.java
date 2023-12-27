package HashTable;

import java.util.HashMap;
import java.util.Map;

public class Start {

    private static String[] cleanAndSplitText(String text) {
        String cleanedText = text.replace(".", "")
                .replace("?", "")
                .toLowerCase();

        return cleanedText.split("\\s");
    }

    public static void main(String[] args) {
        HashMap<String, Integer> WordCount = new HashMap<String, Integer>();

        String str = "To be or not to be";
        String[] words = cleanAndSplitText(str);

        for (String word : words) {
            WordCount.put(word, WordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : WordCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
