package szabi.learnjava.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {

    public static void main(String[] args) {

        List<Number> list = new ArrayList<>();
        list.add(1);

        addPrint(list);

        List<Object> list2 = new ArrayList<>();
        list2.add(1);

        addPrint(list2);
    }

    public static void addPrint(List<? super Integer> list) {

        list.add(10);
        list.add(20);

        System.out.println(list.toString());
    }
}
