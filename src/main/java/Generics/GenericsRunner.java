package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {
    static <X> X doubleValue(X value){
        return value;
    }
    static <X extends List> void duplicateList(X list){
        list.addAll(list);
    }

    // ? - upper bounded wildcard
    static double sumOfNumberList(List<? extends Number> numbers){
        double sum = 0.0;
        for(Number number : numbers){
            sum+= number.doubleValue();
        }
        return sum;
    }

    // ? super - lower bounded wildcard
    static void addCoupleOfValues(List<? super Number> numbers){
       numbers.add(1.2);
       numbers.add(1);
       numbers.add(1f);
       numbers.add(1L);
    }
    public static void main(String[] args) {
        // lower bounded wildcard example of usage
        List<Number> emptyList = new ArrayList<>();
        addCoupleOfValues(emptyList);
        System.out.println(emptyList);

        String value1 = doubleValue("");
        Integer num1 = doubleValue(Integer.valueOf(7));
        ArrayList<Integer> list4 = doubleValue(new ArrayList<>());
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
        duplicateList(numbers);
        System.out.println(numbers);
        // upper bounded wildcard example of usage
        System.out.println(sumOfNumberList(List.of(1,6,8,0,123)));
        System.out.println(sumOfNumberList(List.of(1.2,6,3,8.1,0.98,12.33)));
        //
        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("El 1");
        list.addElement("El 2");
        System.out.println(list.get(0));
        System.out.println(list);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(5);
        list2.addElement(17);
        System.out.println(list2.get(0));
        System.out.println(list2);
        /////
        MyNumberList<Double> list3 = new MyNumberList<>();

    }
}
