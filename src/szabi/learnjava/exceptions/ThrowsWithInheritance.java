package szabi.learnjava.exceptions;

import java.io.IOException;

class Parent {
    public void method() throws IOException {}
}

// 1) if super class does not declare an exception then the child class can only declare unchecked (runtime) exceptions.
// 2) if super class declares an exception then the child class can only declare child exceptions declared by super class.

class Child extends Parent {
    @Override
    public void method() throws IOException {
        super.method();
    }
}

public class ThrowsWithInheritance {

    public static void main(String[] args) {

    }
}
