package szabi.learnjava.collectionframework;

import java.util.Objects;

class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class EqualsHashCode {

    public static void main(String[] args) {

        Person p1 = new Person(1, "Adam");
        Person p2 = new Person(1, "Adam");
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
    }
}
