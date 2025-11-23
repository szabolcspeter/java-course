package szabi.learnjava.collectionframework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        // add is O(1) (FAST)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // to the beginning of the list - fast O(1)
        list.add(0, 5);

        // first and last remove are fast, but removing from intermediate position is not so fast
        list.remove(2);

        for (var number: list) {
            System.out.println(number);
        }
    }
}
