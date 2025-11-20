package szabi.learnjava.exceptions;

import java.util.Scanner;

public class UsingTryCatchBlocks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Give me an integer");
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println(20/n);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception: " + e);
        }

        System.out.println("Rest of the code...");
    }
}
