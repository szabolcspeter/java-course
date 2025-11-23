package szabi.learnjava.collectionframework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {

    public static void main(String[] args) {

        exampleStack();
        exampleQueue();
    }

    public static void exampleStack() {

        // LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(5);
        stack.push(10);

        while (! stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void exampleQueue() {

        // FIFO
        // Deque extends Queue; LinkedList (or ArrayDeque) implements Deque
        Queue<Character> queue = new LinkedList<>();
        queue.add('A');
        queue.add('B');
        queue.add('C');
        queue.add('D');

        while (! queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
