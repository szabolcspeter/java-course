package szabi.learnjava.arrays;

import java.util.Arrays;

public class ArrayClass {


    public static void main(String[] args) {

        int[] nums = {1, 5, 3, -2, 1, 10, 9};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        // binarySearch can be used with one dimensional array which is sorted in order
        int indexOfItem = Arrays.binarySearch(nums, 5);
        System.out.println("Index of item: " + indexOfItem);

        String[] names = new String[10];
        Arrays.fill(names, "undefined");
        System.out.println(Arrays.toString(names));

        // we can compare 2 arrays based on the contents
        int[] num1 = {1, 2, 3, 4};
        int[] num2 = {1, 2, 3, 5};
        System.out.println(Arrays.equals(num1, num2));
    }
}
