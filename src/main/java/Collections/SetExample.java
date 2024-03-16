package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = Set.of("Apple","Banana","Cat");
        Set<String> hashSet = new HashSet<>(set);
        hashSet.add("Cat");
        System.out.println(hashSet);
    }
}
