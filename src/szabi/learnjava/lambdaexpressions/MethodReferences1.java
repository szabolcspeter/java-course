package szabi.learnjava.lambdaexpressions;

import java.util.Arrays;

@FunctionalInterface
interface FuncInterface {

    void print();
}

@FunctionalInterface
interface MsgInterface {

    MessageClass show(String msg);
}

class MessageClass {

    public MessageClass(String msg) {
        System.out.println(msg);
    }
}

public class MethodReferences1 {

    public static void main(String[] args) {

        // Static method reference
        FuncInterface staticMethodReference = MethodReferences1::staticGreeting;
        staticMethodReference.print();

        // Instance method reference
        var obj = new MethodReferences1();
        FuncInterface instanceMethodReference = obj::greeting;
        instanceMethodReference.print();
        FuncInterface instanceMethodReference2 = new MethodReferences1()::greeting;
        instanceMethodReference2.print();

        // Arbitrary object of a particular type
        String[] names = {"Kevin", "Joe", "Adam", "Ana"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

        // Constructor reference
        MsgInterface constructorReference = MessageClass::new;
        constructorReference.show("This is a message");
    }

    public static void staticGreeting() {
        System.out.println("Hello from static method...");
    }

    public void greeting() {
        System.out.println("Hello from instance method...");
    }
}
