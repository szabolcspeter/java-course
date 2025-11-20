package szabi.learnjava.oopprinciples;

// recent feature from Java 17, it is valid for abstract classes and interfaces

abstract sealed class AbstractClass  permits ClassA, ClassB {

    public abstract void doSomething();
}

non-sealed class ClassA extends AbstractClass {

    @Override
    public void doSomething() {
        System.out.println("doSomething() in ClassA ");
    }
}

final class ClassB extends AbstractClass {

    @Override
    public void doSomething() {
        System.out.println("doSomething() in ClassB ");
    }
}

public class SealedExample {

    public static void main(String[] args) {

        AbstractClass classA = new ClassA();
        classA.doSomething();

        AbstractClass classB = new ClassB();
        classB.doSomething();
    }
}
