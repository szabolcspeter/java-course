package szabi.learnjava.oopprinciples;

// Java under the hood will generate boilerplate code for us
record StudentRecord(String name, String address, int age, String gender) {

    // sometimes we define static method
    public static final String ID = "12345678";
}

public class RecordExample {

    public static void main(String[] args) {

        StudentRecord stud1 = new StudentRecord("Kevin", "Wall Street 12", 23, "male");
        StudentRecord stud2 = new StudentRecord("Kevin", "Wall Street 12", 23, "male");

        // Java generates equals() method for us - so the below is true
        System.out.println(stud1.equals(stud2));

        // Java generates toString()
        System.out.println(stud1);

        System.out.println(stud1.address());
        System.out.println(stud1.name());
        System.out.println(stud1.age());
        System.out.println(stud1.gender());
        System.out.println(StudentRecord.ID);
    }
}
