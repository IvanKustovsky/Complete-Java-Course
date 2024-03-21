package javaNewFeatures.copyOfApi;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Jim");
        names.add("James");

        var copyOfNames = List.copyOf(names); // creates IMMUTABLE list. The same with Set, Map

        doNotChange(copyOfNames);
        System.out.println(copyOfNames);
    }

    private static void doNotChange(List<String> names) {
        names.add("ShouldNotBeAllowed");
    }
}
