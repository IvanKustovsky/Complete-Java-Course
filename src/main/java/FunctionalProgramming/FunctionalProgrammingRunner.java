package FunctionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Banana","Cat","Dog","Bat");
        printWithFPWithFiltering(list);
    }

    private static void printBasicWithFiltering(List<String> list){
        for(String string:list){
            if(string.endsWith("at")) {
                System.out.println(string);
            }
        }
    }

    private static void printWithFPWithFiltering(List<String> list){
        list.stream().filter(element -> element.endsWith("at")).
                forEach(element -> System.out.println("element - " + element));
    }
}
