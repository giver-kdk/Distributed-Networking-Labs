import java.util.*;

public class MapReduceDriver {
    public static void main(String[] args) {
        String[] input = {
            "JavaScript and Python are widely used",
            "Giver codes in Java, Python and C++",
            "Rust and Go are modern programming languages",
            "Python is loved by Giver",
            "Giver is learning MapReduce in Java"
        };

        Mapper mapper = new Mapper();
        Reducer reducer = new Reducer();

        List<Map.Entry<String, Integer>> mappedResults = new ArrayList<>();

        // Map step
        for (String line : input) {
            mappedResults.addAll(mapper.map(line));
        }

        // Reduce step
        Map<String, Integer> finalCounts = reducer.reduce(mappedResults);

        // Print the result
        for (Map.Entry<String, Integer> entry : finalCounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
