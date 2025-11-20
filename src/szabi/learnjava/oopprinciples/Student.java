package szabi.learnjava.oopprinciples;

class Student extends Person {

    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
//        super.setName(name);
//        super.setAge(age);
        this.university = university;
    }

    public void showStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Univ: " + university);
    }

    public void showAge() {
        super.showAge();
    }
}
