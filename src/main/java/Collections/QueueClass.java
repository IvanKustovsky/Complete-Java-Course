package Collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o2.length(), o1.length());
    }
}

public class QueueClass {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        System.out.println(queue.poll());
        queue.addAll(List.of("Zebra212", "Snake", "Monkey", "Cat"));
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
