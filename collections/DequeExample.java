package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> linkedListDeque = new LinkedList<String>();
        Deque<String> arrayDequeue = new ArrayDeque<String>();

        linkedListDeque.add("1");
        System.out.println(linkedListDeque);
        linkedListDeque.add("2");
        System.out.println(linkedListDeque);
        linkedListDeque.addFirst("3");
        System.out.println(linkedListDeque);
        linkedListDeque.addLast("4");
        System.out.println(linkedListDeque);

        boolean isAddSuccess = arrayDequeue.offer("1");
        if (isAddSuccess) {
            System.out.println("Add element 1 to arrayDequeue success!");
        }
        String firstElement = arrayDequeue.peek();
        System.out.println(firstElement);
        String lastElement = arrayDequeue.pollLast();
        System.out.println("Last element = " + lastElement);
    }
}
