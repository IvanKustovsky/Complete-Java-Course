package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        String str = "This is an awesome occasion. This has never happened before. happened";
        Map<Character, Integer> map = new HashMap<>();

        char[] characters = str.toCharArray();

        for (char character : characters) {
            Integer value = map.get(character);
            if (value == null) {
                map.put(character, 1);
            } else {
                map.put(character, value + 1);
            }
        }
        System.out.println(map);

        // String map
        Map<String, Integer> stringMap = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            stringMap.merge(word, 1, Integer::sum);
        }
        System.out.println(stringMap);

        Map<Integer, String> states = new HashMap<>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");


        Set<Map.Entry<Integer,String>> entrySet = states.entrySet();
        // Map.Entry is object of Map
        for(Map.Entry<Integer, String> item : entrySet){
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
        // Iterator
        Iterator<String> iterator = states.values().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
