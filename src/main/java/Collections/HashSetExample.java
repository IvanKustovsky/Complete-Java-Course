package Collections;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet - рандомний порядок
        Set<Integer> numbers = new HashSet<>();
        numbers.add(2521);
        numbers.add(12);
        numbers.add(521323);
        numbers.add(1246);
        numbers.add(77777);
        System.out.println(numbers);
        // LinkedHashSet - розташування в порядку додавання
        Set<Integer> numbers1 = new LinkedHashSet<>();
        numbers1.add(2521);
        numbers1.add(12);
        numbers1.add(521323);
        numbers1.add(1246);
        numbers1.add(77777);
        System.out.println(numbers1);
        // TreeSet - сортує в порядку зростання
        Set<Integer> numbers2 = new TreeSet<>();
        numbers2.add(2521);
        numbers2.add(12);
        numbers2.add(521323);
        numbers2.add(1246);
        numbers2.add(77777);
        System.out.println(numbers2);
        //Character example
        List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
        Set<Character> uniqueChar = new TreeSet<>(characters);
        System.out.println(uniqueChar);

        Set<Character> linkedHashSetUniqueChar = new LinkedHashSet<>(characters);
        System.out.println(linkedHashSetUniqueChar);

    }
}
