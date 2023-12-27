package HashTable;

import java.util.HashMap;

public class Start {

    private static String[] cleanAndSplitText(String text) {
        String cleanedText = text.replace(".", "")
                .replace("?", "")
                .toLowerCase();

        return cleanedText.split("\\s");
    }

    public static void main(String[] args) {
        HashMap<String, Integer> WordCount = new HashMap<String, Integer>();

        LinkedList<String, Integer> L1 = new LinkedList<>();

        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = cleanAndSplitText(str);

        for (String word : words) {
            WordCount.put(word, WordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : words) {
            L1.add(word, WordCount.get(word));
        }

        // L1.display();
        int idx = L1.getIndex("avoidable");
        if (idx != -1) {
            System.out.println(" word found at index " + idx);
        } else {
            System.out.println("word not found");
        }

        System.out.println("Frequency of avoidable is " + L1.frequency("avoidable"));
        System.out.println("Frequency of paranoid is " + L1.frequency("paranoid"));

        words = L1.remove("avoidable");

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
