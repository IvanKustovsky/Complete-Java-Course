package FunctionalProgramming;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPRunner {
    public static void main(String[] args) {
        List<Integer> nums = List.of(4,6,8,13,3,15,3,4,5,7,89,382);
       //int sum = fpSum(nums);
       //nums.stream().sorted().forEach(e-> System.out.println(e));
       //nums.stream().distinct().sorted().map(e -> e*e).forEach(e-> System.out.println(e));

        //Exercises
        //IntStream.range(1,11).map(x -> x * x).forEach(x -> System.out.println(x));
        System.out.println(IntStream.range(1,11).reduce(0,(num1,num2) -> num1+num2));
        /////Find max
        System.out.println(nums.stream().max((n1,n2)->Integer.compare(n1,n2)).get());
        System.out.println(nums.stream().max(Integer::compare).get());
        System.out.println(nums.stream().max(Comparator.comparingInt(n -> n)).get());
        /////////////////////
        System.out.println(nums.stream().min(Integer::compare).get());
        System.out.println(nums.stream().min(Comparator.comparingInt(n -> n)).get());
        ///////////only odd numbers
        nums.stream().filter(e->e%2==1).forEach(e -> System.out.print(e + " "));
        /////////Collect
        System.out.println(nums.stream().filter(e -> e % 2 == 1).collect(Collectors.toList()));
        System.out.println(nums.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));
        ///////////
        //IntStream.range(1,11).map(e->e*e) --- This is IntPipeline, not stream/ To convert into stream use boxed(below)
        System.out.println(IntStream.range(1,11).map(e -> e * e).boxed().collect(Collectors.toList()));

        ////////// null exception
        List<Integer> list = List.of(23,45,67,13,18);
        System.out.println(list.stream().filter(x -> x % 2 == 0).max(Integer::compare).get());//Exception if list is empty
        System.out.println(list.stream().filter(x -> x % 2 == 0).max(Integer::compare).isPresent());
        System.out.println(list.stream().filter(x -> x % 2 == 0).max(Integer::compare).orElse(0)); //0 if empty


    }

    private static int fpSum(List<Integer> nums){
        return nums.stream().reduce(0,(num1,num2) -> num1+num2);
    }

}
