package javaNewFeatures.predicateNotApi;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {
    public static void main(String[] args) {
        var numbers = List.of(3, 6, 88, 21, 17, 28);
        Predicate<Integer> evenNumberPredicate = num -> num % 2 == 0;
        /*numbers.stream()
                .filter(evenNumberPredicate.negate())
                .forEach(System.out::println);*/

        numbers.stream()
                .filter(Predicate.not(PredicateNotRunner::isEven))
                .forEach(System.out::println);
    }

    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }
}
