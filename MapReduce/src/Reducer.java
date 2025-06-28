import java.util.*;

public class Reducer {
    // Simulates the Reduce step: sums counts for each word
    public Map<String, Integer> reduce(List<Map.Entry<String, Integer>> mappedData) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mappedData) {
            wordCounts.put(entry.getKey(), wordCounts.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
        return wordCounts;
    }
}
