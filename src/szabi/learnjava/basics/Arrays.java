package szabi.learnjava.basics;

public class Arrays {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[1]);

        String[] names = {"Peter", "Szabi"};
        names[0] = "Daniel";
        System.out.println(names[1]);
        System.out.println(names[0]);
    }
}
