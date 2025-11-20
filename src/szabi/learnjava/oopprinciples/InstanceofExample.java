package szabi.learnjava.oopprinciples;

class Animal {}

class Dog extends Animal {}

public class InstanceofExample {

    public static void main(String[] args) {

        Object something = new String("Hello1");
        determineParameterType(something);

        determineParameterType2("Hello2");

        Animal animal = new Dog();
        determineParameterType2(animal);
    }

    public static void determineParameterType(Object obj) {

        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("It is a string: " + str);
        }
    }

    public static void determineParameterType2(Object obj) {

        // From Java 14 it allows cast and instanceof in the same step
        if (obj instanceof String str) {
            System.out.println("It is a string: " + str);
        }

        if (obj instanceof Dog dog) {
            System.out.println("It is a dog: " + dog);
        }
    }
}
