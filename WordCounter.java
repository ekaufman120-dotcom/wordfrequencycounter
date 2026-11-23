import java.util.*;

public class WordCounter {
    public static void main(String[] args) {

        String[] words = {
            "java", "tree", "map", "java",
            "map", "java", "queue"
        };

        Map<String, Integer> counts = new HashMap<>();
        ArrayList<String> uniqueWords = new ArrayList<>();

        for (String word : words) {

            // TODO:
            // If the word exists, increase its count.
            // Otherwise, add the word with a count of 1.
            if(counts.containsKey(word))
                counts.put(word,counts.get(word)+1);
            else
            {
                counts.put(word,1);
                uniqueWords.add(word);
            }
        }

        // TODO: Print each word and its frequency.

        for(String word : uniqueWords)
        {
            System.out.println("\""+word+"\" appears "+counts.get(word)+" times.");
        }

        // TODO: Print the number of unique words.

        System.out.println("There are "+uniqueWords.size()+" unique words.");
    }
}