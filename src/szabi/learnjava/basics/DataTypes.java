package szabi.learnjava.basics;

public class DataTypes {

    public static void main(String[] args) {

        int num = 100_000_000;
        System.out.println("num is " + num );

        float floatNumber = 5.2e5f;
        System.out.println("floatNumber is " + floatNumber);

        double doubleNumber = 5.2e5d;
        System.out.println("doubleNumber is " + doubleNumber);

        int items = 100;
        float costPerItem = 1.99f;
        float totalCost = items * costPerItem;
        System.out.println("totalCost is " + totalCost);
    }
}
