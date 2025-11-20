package szabi.learnjava.oopprinciples;

abstract class Shape {

    public abstract void calculateArea();
}

class Circle extends Shape {

    @Override
    public void calculateArea() {
        System.out.println("Calculating the area of a circle.");
    }
}

class Rectangle extends Shape {

    @Override
    public void calculateArea() {
        System.out.println("Calculating the area of a rectangle");
    }
}

public class AbstractionExample {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.calculateArea();
        rectangle.calculateArea();
    }
}
