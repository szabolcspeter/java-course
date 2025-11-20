package szabi.learnjava.conditionals;

public class SwitchNewApproach {

    public static void main(String[] args) {

        int x = 3;

        String str = switch(x) {
            case 1 -> "one";
            case 2 -> "two";
            case 3, 4, 5 -> "three four or five";
            default -> "Not a valid input";
        };

        System.out.println(str);
    }
}
