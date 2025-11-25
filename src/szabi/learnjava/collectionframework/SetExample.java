package szabi.learnjava.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        // Sets are not thread safe and doesn't contain duplicate elements

        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(3);
        set.add(5);
        set.add(6);
        set.add(5);

        System.out.println(set.contains(3));

        for (Integer number: set) {
            System.out.println(number);
        }

        // if we want to keep insertion order we can use LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(3);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(5);

        System.out.println(linkedHashSet.contains(3));

        for (Integer number: linkedHashSet) {
            System.out.println(number);
        }

        Set<Integer> treeset = new TreeSet<>();
        treeset.add(3);
        treeset.add(3);
        treeset.add(5);
        treeset.add(6);
        treeset.add(5);
        treeset.add(23);
        treeset.add(43);
        treeset.add(-10);
        treeset.add(2);

        System.out.println(treeset.contains(3));

        for (Integer number: treeset) {
            System.out.println(number);
        }
    }
}
