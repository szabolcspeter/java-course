package szabi.learnjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {

    public static void main(String[] args) {

        // map() and flatmap() are similar to selecting a column in SQL

        // map()
        List<String> words = Arrays.asList("Adam", "Ana", "Daniel");
        List<Integer> lengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        lengths.stream().forEach(System.out::println);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        nums.stream()
                .map(x -> x * x)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // flatmap() - mapping each array not with a stream but with the
        // contents of that stream
        String[] array = {"hello", "shell"};
        List<String> unique = Arrays.stream(array)
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        unique.stream().forEach(System.out::println);
    }
}
