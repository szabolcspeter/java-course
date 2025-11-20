package szabi.learnjava.oopprinciples;

class Address {

    private String street;
    private int zip;

    public Address(String street, int zip) {
        this.street = street;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zip=" + zip +
                '}';
    }
}

class Employee {

    private String name;
    private int age;
    private float salary;
    // composition
    private Address address;

    public Employee(String name, int age, float salary, Address address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
