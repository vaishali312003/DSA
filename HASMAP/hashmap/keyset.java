import java.util.HashMap;
import java.util.Set;

public class keySet {
    public static void main(String[] args) {
        HashMap<String, Integer> var = new HashMap<>();
        var.put("INDIA", 10);
        var.put("CHINA", 10);

        // Get the set of keys
        Set<String> keys = var.keySet();

        // Print the keys
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
