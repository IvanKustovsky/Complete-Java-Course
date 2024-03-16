package FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer>{
    @Override
    public boolean test(Integer number){
        return number % 2 == 0;
    }
}

class PrintElementPredicate implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.print(integer + " ");
    }
}

class NumberSquareMapper implements Function<Integer,Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer * integer;
    }
}

public class LambdaBehindTheScreensRunner {
    public static void main(String[] args) {
        List.of(4,6,8,13,3,15,3,4,5,7,89,382).
                stream().filter(e -> e % 2 == 1).
                forEach(e -> System.out.print(e + " "));

        // Stream<T> filter(Predicate<? super T> predicate);  e -> e % 2 == 1 - is predicate

        //using own predicate class
        Stream.of(4,6,8,13,3,15,3,4,5,7,89,382)
                .filter(new EvenNumberPredicate()).forEach(new PrintElementPredicate());

        //<R> Stream<R> map(Function<? super T, ? extends R> mapper);
        System.out.println();
        Stream.of(4,6,8,13,3,15,3,4,5,7,89,382).filter(e->e%2==1).map(e->e*e).
                forEach(e -> System.out.print(e + " "));
        System.out.println();
        Stream.of(4,6,8,13,3,15,3,4,5,7,89,382).filter(new EvenNumberPredicate()).
                map(new NumberSquareMapper()).
                forEach(new PrintElementPredicate());
    }
}
