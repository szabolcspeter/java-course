package szabi.learnjava.lambdaexpressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@java.lang.FunctionalInterface
interface Add {

    // SAM - Single Abstract Method
    int add(int num1, int num2);

    static String staticExample() {
        return "This is a static method in an interface";
    }

    default void defaultMethod() {
        System.out.println("This is the default method");
    }
}

public class FunctionalInterfaces {

    public static void main(String[] args) {

        // Supplier, Consumer, Function, Predicate functional interfaces are already included in Java

        // Consumer takes single input argument, returns NO result
        Consumer<String> consumer = str -> System.out.println(str.toUpperCase());
        consumer.accept("This is an example");

        // Supplier takes NO input, returns output
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());

        // Predicate represents a boolean-valued function of one argument
        Predicate<Integer> predicate = arg -> arg > 10;
        System.out.println(predicate.test(20));

        // Predicates can be combined
        Predicate<String> strPredicate1 = str -> str.length() % 2 == 0;
        Predicate<String> strPredicate2 = str -> str.startsWith("A");
        Predicate<String> combined = strPredicate1.and(strPredicate2);
        System.out.println(combined.test("Adam"));

        // Function accepts one argument and returns a result
        Function<String, String> function = str -> {
            return str + "!!!";
        };
        System.out.println(function.apply("Hello, World"));
    }
}
