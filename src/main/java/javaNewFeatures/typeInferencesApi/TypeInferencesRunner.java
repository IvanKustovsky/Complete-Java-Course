package javaNewFeatures.typeInferencesApi;

import java.util.List;
import java.util.stream.Stream;

public class TypeInferencesRunner {
    public static void main(String[] args) {
        List<String> names1 = List.of("Ivan", "Andriy");
        List<String> names2 = List.of("John", "Cristiano");
        //List<List<String>> names = List.of(names1, names2);
        var names = List.of(names1, names2);
        names.stream().forEach(System.out::println);

        for (var name : names){
            System.out.println(name);
        }

        // var abc = null; Not Allowed

        var String = "var"; // var is NOT a keyword

        var filter = List.of("Ivan", "Andriy").stream().filter(x -> x.length() > 4);
        filter.forEach(System.out::println);

     }
}
