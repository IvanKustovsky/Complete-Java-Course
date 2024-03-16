package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        // Integer: highest element -  the lowest priority
        System.out.println(priorityQueue); // 1 4 7 10 8 ?? при виведенні на екран
        // елементів у них нема сортування по пріоритету, тому тут 8 іде після 10. Приорит при використанні!!!
        System.out.println("peek: " + priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());

    }
}
