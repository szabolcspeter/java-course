package szabi.learnjava.methods;

public class MethodParameters {

    public static void main(String[] args) {

        add(1, 2, 3, 4, 5);
    }

    // varargs - variable length arguments
    public static void add(int... numbers) {
        int result = 0;

        for (int num: numbers) {
            result += num;
        }

        System.out.println(result);
    }
}
