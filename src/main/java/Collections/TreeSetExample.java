package Collections;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Set.of(12, 124, 64, 1, 8, 2421, 9999));
        System.out.println(treeSet);
        System.out.println(treeSet.floor(66));
        System.out.println("floor " + treeSet.floor(64));
        System.out.println("lower " + treeSet.lower(64));
        System.out.println("ceiling " + treeSet.ceiling(33));
        System.out.println("ceiling " + treeSet.ceiling(167));
        System.out.println("ceiling " + treeSet.ceiling(64));
        System.out.println("higher " + treeSet.higher(64));
        System.out.println(treeSet.subSet(10, 500));
        System.out.println(treeSet.subSet(8, 64));
        System.out.println(treeSet.subSet(8, true, 64, true));
        System.out.println(treeSet.subSet(8, false, 64, true));
        System.out.println(treeSet.tailSet(30));

        //
        TreeSet<Student> people = new TreeSet<>();
        people.add(new Student(1, "Tom"));
        people.add(new Student(12, "Clark"));
        people.add(new Student(37, "John"));
        people.add(new Student(24, "Tom"));
        System.out.println(people);

        // NavSet extends SortedSet nav set >> sorted set
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(3);
        navigableSet.add(1);
        navigableSet.add(2);
        navigableSet.add(12);
        navigableSet.add(87);
        navigableSet.add(-129);
        System.out.println(navigableSet);
        System.out.println(navigableSet.ceiling(12));
        System.out.println(navigableSet.higher(12));
        System.out.println(navigableSet.floor(12));
        System.out.println(navigableSet.lower(12));

    }
}

