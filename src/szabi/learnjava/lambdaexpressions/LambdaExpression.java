package szabi.learnjava.lambdaexpressions;

@FunctionalInterface
interface Sum {

    int sum(int num1, int num2);
}

public class LambdaExpression {

    public static void main(String[] args) {

        // lambdas can be sued with functional interfaces
        Sum mathOperation = (num1, num2) -> {return num1 + num2;};

        System.out.println(mathOperation.sum(10, 30));
    }
}
