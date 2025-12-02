package szabi.learnjava.lambdaexpressions;

@FunctionalInterface
interface MathOperation {

    int sum(int num1, int num2);
}

public class MethodReferences2 {

    public static void main(String[] args) {

        // lambda expression related solution
        // operation chaining
        MathOperation o1 = (num1, num2) -> add(num1, increment(num2));
        System.out.println(o1.sum(10, 20));

        // method reference related solution
        // streams with microservice architecture
        MathOperation o2 = MethodReferences2::add;
        // we can't use method chaining
        // MathOperation o2 = MethodReferences2::add::increment; //cannot resolve method increment
        System.out.println(o2.sum(10, 20));
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int increment(int num) {
        return num += 10;
    }
}
