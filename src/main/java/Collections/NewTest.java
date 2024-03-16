package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NewTest {
    public static void main(String[] args) {
        List<Integer> digits = List.of(101, 24, 5, 16, 283);
        List<Integer> digitsAL = new ArrayList<>(digits);
        Collections.sort(digitsAL);
        print(digitsAL);
    }

    public static void print(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
