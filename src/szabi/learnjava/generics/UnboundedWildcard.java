package szabi.learnjava.generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Hello");
        names.add("what's up?");

        print(names);

        List<Boolean> bools = new ArrayList<>();
        bools.add(true);
        bools.add(false);

        print(bools);
    }

    public static void print(List<?> list) {

        for (Object item: list) {
            System.out.println(item);
        }

        System.out.println(list.size());
    }
}
