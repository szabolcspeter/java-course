package szabi.learnjava.exceptions;

public class NestedTryCatchBlocks {

    public static void main(String[] args) {

        try {
            int numbers[] = {1, 2, 3, 4, 5};
            // System.out.println(numbers[9]);

            try {
                int x = numbers[3] / 0;
                System.out.println("Result of division: " + x);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception: " + e);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception: " + e);
        }

        System.out.println("Rest of the code...");
    }
}
