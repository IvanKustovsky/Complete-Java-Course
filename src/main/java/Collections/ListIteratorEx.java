package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        ListIterator<String> listIter = states.listIterator();
        while (listIter.hasNext()) {
            System.out.println(listIter.next());
        }
        // current element - Spain, lets change value of this element
        listIter.set("Португалія");
        // пройдемося по елементах у зворотному порядку
        while (listIter.hasPrevious()) {
            System.out.println(listIter.previous());
        }

        // Example is palindrome
        String str = "madamy";
        List<Character> characters = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            characters.add(str.charAt(i));
        }
        ListIterator<Character> listIterator = characters.listIterator();
        ListIterator<Character> reverseListIterator = characters.listIterator(characters.size());
        boolean isPalindrom = true;
        while (listIterator.hasNext()) {
            if (listIterator.next() != reverseListIterator.previous()) {
                isPalindrom = false;
                break;
            }
        }
        System.out.println("String " + str + " is palindrome: " + isPalindrom);
    }
}
