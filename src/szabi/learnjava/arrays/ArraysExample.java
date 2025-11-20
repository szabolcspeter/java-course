package szabi.learnjava.arrays;

public class ArraysExample {

    public static void main(String[] args) {

        int[][] nums = new int[10][10];

        for (int i=0; i< nums.length;i++) {
            for (int j=0; j< nums[0].length; j++) {
                nums[i][j] = i * nums[0].length + j + 1;
                System.out.printf("%4s", nums[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nSecond array (nums2):\n");

        int[][] nums2 = {{1, 2, 3, 4}, {3, 1, 5}, {0}};

        for (int i=0; i< nums2.length;i++) {
            for (int j=0; j< nums2[i].length; j++) {
                System.out.printf("%4s", nums2[i][j]);
            }
            System.out.println();
        }
    }
}
