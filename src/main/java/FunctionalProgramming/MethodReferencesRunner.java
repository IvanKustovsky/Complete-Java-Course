package FunctionalProgramming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MethodReferencesRunner {
    public static void main(String[] args) {
        List.of("Ant","Cat","Bat","Dog","Elephant").stream().
        map(s -> s.length()).
        forEach(s ->  System.out.println("Word length is " + s));
        Stream.of("Ant","Cat","Bat","Dog","Elephant").
                map(String::length).
                forEach(System.out::println); //Shortcut for s -> System.out.println(s)
        //////////////////Another way(the same as System.out::println, but with my own method in this class
        Stream.of("Ant","Cat","Bat","Dog","Elephant").
                map(String::length).
                forEach(MethodReferencesRunner::print);// Another shortcut for s -> System.out.println(s)

        //------------------------------------
        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
        Predicate<Integer> oddPredicate = createOddPredicate();
        Stream.of(4,6,8,13,3,15,3,4,5,7,89,382).
                filter(evenPredicate)
                .map(n -> n * n)
                .forEach(s -> System.out.println("Even number square is " +s));

        Stream.of(4,6,8,13,3,15,3,4,5,7,89,382).
                filter(oddPredicate)
                .map(n -> 2 * n)
                .forEach(s -> System.out.println("Double odd number value is " + s));

        Integer max = Stream.of(4,6,8,13,3,15,3,4,5,7,89,382).
                filter(MethodReferencesRunner::filterEvenNumbers).
                max(MethodReferencesRunner::compare).
                orElse(0);
        System.out.println("Max value of integer stream is " + max);
        Integer max1 = Stream.of(4,6,8,13,3,15,3,4,5,7,89,382).
                filter(MethodReferencesRunner::filterEvenNumbers).
                max(Integer::compare).
                orElse(0);
        System.out.println("Max value of integer stream is " + max1);
    }

    private static Predicate<Integer> createOddPredicate() {
        return x -> x % 2 == 1;
    }

    public static void print(Integer num){
        System.out.println(num);
    }

    public static boolean filterEvenNumbers(Integer number){
        return number % 2 == 0;
    }
    public static Integer compare(Integer n1,Integer n2){
        return Integer.compare(n1,n2);
    }
}
