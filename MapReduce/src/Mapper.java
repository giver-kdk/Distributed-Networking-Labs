import java.util.*;

public class Mapper {
    // Simulates the Map step: splits lines into words, outputs (word, 1)
    public List<Map.Entry<String, Integer>> map(String line) {
        List<Map.Entry<String, Integer>> results = new ArrayList<>();
        String[] words = line.toLowerCase().split("\\W+");
        for (String word : words) {
            if (word.length() > 0) {
                results.add(new AbstractMap.SimpleEntry<>(word, 1));
            }
        }
        return results;
    }
}
