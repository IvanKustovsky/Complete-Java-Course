package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A",3,"B",5,"G",10);
        System.out.println(map);
        System.out.println(map.get("G"));
        System.out.println(map.get("S"));
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("B"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        // Hash Map
        Map<String, Integer> hashMap = new HashMap<>(map);
        hashMap.put("F",7);
        System.out.println(hashMap);
        hashMap.put("G",22);
        System.out.println(hashMap);
    }
}
