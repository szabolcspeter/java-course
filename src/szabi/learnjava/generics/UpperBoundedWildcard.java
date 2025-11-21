package szabi.learnjava.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcard {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);

        print(integers);

        List<Double> doubles = new ArrayList<>();
        doubles.add(10.0);
        doubles.add(20.0);

        print(doubles);
    }

    public static void print(List<? extends Number> list) {

        for (Number item: list) {
            System.out.println(item);
        }
    }
}
