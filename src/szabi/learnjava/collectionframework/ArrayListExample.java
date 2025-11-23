package szabi.learnjava.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        // add element (FAST operation)
        names.add("Adam");
        names.add("Kevin");
        names.add("Ana");
        names.add("Daniel");

        // Get item at index 0 (FAST operation)
        System.out.println(names.get(0));

        for (String str: names) {
            System.out.println(str);
        }

        // insert item to index 0 (SLOW operation)
        names.add(0, "Stephen");

        // remove item (SLOW operation)
        names.remove("Adam");

        for (String str: names) {
            System.out.println(str);
        }

        System.out.println(names.size());
        System.out.println(names.isEmpty());
    }
}
