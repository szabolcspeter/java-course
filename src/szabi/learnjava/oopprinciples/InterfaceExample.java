package szabi.learnjava.oopprinciples;

interface Vehicle {
    void start();
    void stop();

    // default method that may not be implemented
    default void move() {
        System.out.println("This is the default method...");
    }

    // static methods - we can't override static methods in an interface
    static void sound() {
        System.out.println("This is a static method");
    }
}

// functional interface is an interfaces with a single method = lambda functions
@FunctionalInterface
interface Calculator {

    int add(int num1, int num2);
}

class Truck implements Vehicle {

    @Override
    public void start() {
        System.out.println("Truck is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping...");
    }

    @Override
    public void move() {
        System.out.println("This is from the Truck class");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        Vehicle truck = new Truck();
        truck.start();
        truck.stop();
        truck.move();
        Vehicle.sound();
    }
}
