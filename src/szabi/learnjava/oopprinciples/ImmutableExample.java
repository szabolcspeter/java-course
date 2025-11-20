package szabi.learnjava.oopprinciples;

class ImmutablePerson {

    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ImmutableExample {

    public static void main(String[] args) {

        ImmutablePerson person = new ImmutablePerson("Kevin", 24);
    }
}
