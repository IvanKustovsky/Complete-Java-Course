package Collections;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Bad", "cat");
        System.out.println(words.size());
        System.out.println(words.isEmpty());
        System.out.println(words.get(0));
        System.out.println(words.contains("China"));
        System.out.println(words.indexOf("Bad"));
        List<String> wordsArrayList = new ArrayList<>(words);
        List<String> wordslinkedList = new LinkedList<>(words);
        List<String> wordsVector = new Vector<>(words);
        wordsArrayList.add("Dog");
        List<String> newList = List.of("Zak", "Zebra");
        wordsArrayList.addAll(newList);
        wordsArrayList.set(1, "Urde");
        wordsArrayList.remove(0);
        wordsArrayList.remove("Bad");

        Iterator<String> wordsIterator = words.iterator();
        while (wordsIterator.hasNext()) {
            System.out.println(wordsIterator.next());
        }

        List<String> words1 = List.of("Apple", "Cat", "Bat");
        List<String> wordsAL = new ArrayList<>(words1);
        for (String word : words1) {
            if (word.endsWith("at")) {
                System.out.println(word);
            }
        }

        for (String word : wordsAL) {
            if (word.endsWith("at")) {
                wordsAL.remove(word);
            }
        }
        Iterator<String> iterator = wordsAL.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().endsWith("at")) {
                iterator.remove();
            }
        }
    }
}
