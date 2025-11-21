package szabi.learnjava.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    public static void main(String[] args) {

        String[] array = {"Adam", "Ana", "Kevin"};
        printArray(array);

        Integer[] nums = {1, 2, 3, 4, 5};
        printArray(nums);

    }

    public static <T> void printArray(T[] items) {

        for (T item: items) {
            System.out.println(item);
        }
    }
}
