package szabi.learnjava.collectionframework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        // TreeMap stores items in a sorted order

        Map<Integer, String> treemap = new TreeMap<>();
        treemap.put(10, "Ten");
        treemap.put(2, "Two");
        treemap.put(5, "Five");
        treemap.put(7, "Seven");
        treemap.put(1, "One");
        treemap.put(11, "Eleven");

        for (Map.Entry<Integer, String> entry: treemap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
