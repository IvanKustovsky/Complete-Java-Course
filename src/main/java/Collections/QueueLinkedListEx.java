package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Ivan");
        queue.add("Oleg");
        queue.add("Eugene");
        queue.add("Katya");
        queue.offer("Sasha");
        System.out.println(queue);
        System.out.println("Person to remove: " + queue.remove());
        System.out.println("Person to poll: " + queue.poll());
        System.out.println("Current element: " +queue.element());
        queue.poll();
        System.out.println("Current peek: " +queue.peek());
        /* add - додає елемент в кінець черги, але викине помилку, якщо черга має обмежену місткість елементів.
        offer також додає елемент в кінець черги, але в випадку, коли черга заповнена і не може прийняти
        більше елементів, він просто повертає false, не генеруючи виняток.
        -------------------------------
         remove викидає помилку при спробі видалення елемента в пустій черзі, а poll - ні (повертає null)
        -------------------------------
         element викидає помилку при спробі отримання елемента в пустій черзі, а peek - ні (повертає null)
         ------------------------------
        add(), remove() and element() - exception; offer(), poll() and peek() - null */

        Queue<Integer> queue1 = new LinkedList<>();
        boolean added = queue1.offer(1);
        boolean addedAgain = queue1.offer(2);
        System.out.println(added + " " + addedAgain);
        System.out.println(queue1);
    }
}
