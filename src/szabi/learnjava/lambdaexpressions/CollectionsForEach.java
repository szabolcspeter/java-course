package szabi.learnjava.lambdaexpressions;

import java.util.*;

public class CollectionsForEach {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Brad");
        names.add("Kevin");
        names.add("Ana");

        names.forEach(str -> System.out.println(str));
        names.forEach(System.out::println);

        Set<Integer> items = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        items.forEach(num -> System.out.println(num));
        items.forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        // here only lambda expression can be used. Method reference can use only a single item
        // (but here we have key value pairs)
        map.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}
