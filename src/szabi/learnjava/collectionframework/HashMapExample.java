package szabi.learnjava.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        // We rewrite the value at key 3
        map.put(3, "Four");

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
