package szabi.learnjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceAndOtherConcepts {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        Optional<Integer> result = nums.stream()
                .reduce(Integer::max);
        result.ifPresent(System.out::println);

        nums.stream()
                .reduce(Integer::min)
                .ifPresent(System.out::println);

        List<Book> books = new ArrayList<>();
        books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
        books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
        books.add(new Book("Death on the Nile", "Agatha Christie", 370, Type.THRILLER));
        books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
        books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
        books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
        books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));

        // we want to get the longest book
        books.stream()
                .reduce((b1, b2) -> b1.getPages() > b2.getPages() ? b1 : b2)
                .ifPresent(System.out::println);

        // sum all pages of all books
        // we have to transform Stream<Integer> into an integer stream "list of integers"
        IntStream totalPages = books.stream()
                .mapToInt(Book::getPages);
        System.out.println(totalPages.sum());

        // convert back to Stream<Integer>
//        Stream<Integer> convertedBack = totalPages.boxed();
//        convertedBack.forEach(System.out::println);
    }
}
