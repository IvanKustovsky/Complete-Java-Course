package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(12);
        deque.addLast(8);
        deque.offerFirst(7);
        deque.offerLast(122);
        System.out.println(deque);
        System.out.println(deque.getLast());   // throws an exception if empty
        System.out.println(deque.getFirst());  // throws an exception if empty
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.peekFirst()); // returns null if empty
        System.out.println(deque.peekLast());  // returns null if empty
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
