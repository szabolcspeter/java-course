package szabi.learnjava.streams;

import java.util.*;

public class OptionalExamples {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
        books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
        books.add(new Book("Death on the Nile", "Agatha Christie", 370, Type.THRILLER));
        books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
        books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
        books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
        books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));

        OptionalInt result = books.stream()
                .mapToInt(Book::getPages)
                .max();
        System.out.println(result.orElse(0));

        OptionalDouble result2 = books.stream()
                .mapToDouble(Book::getPages)
                .max();
        System.out.println(result2.orElse(0.0d));

        OptionalLong result3 = books.stream()
                .mapToLong(Book::getPages)
                .max();
        System.out.println(result3.orElse(0));
    }
}
