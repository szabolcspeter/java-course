package szabi.learnjava.oopprinciples;

public class CompositionExample {

    public static void main(String[] args) {

        Address address = new Address("Wall Stree 12", 1234);
        Employee employee = new Employee("Kevin", 30, 300000f, address);
        System.out.println(employee);
    }
}
