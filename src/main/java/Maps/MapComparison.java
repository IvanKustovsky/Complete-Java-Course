package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapComparison {
    public static void main(String[] args) {
        // HashMap - random order
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Z", 5);
        hashMap.put("B", 11);
        hashMap.put("J", 9);
        hashMap.put("Y", 2);
        System.out.println(hashMap);

        // LinkedHashMap - insertion order
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("F", 25);
        linkedHashMap.put("A", 15);
        linkedHashMap.put("Z", 5);
        linkedHashMap.put("L", 250);
        System.out.println(linkedHashMap);

        /* TreeMap - sorted order;
        TreeMap extends AbstractMap and implements interfaces NavigableMap accordingly and SortedMap;
        TreeMap > NavigableMap > SortedMap
        Objects of TreeMap automatically sorted by their key value(increasing order)
        */
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("F", 25);
        treeMap.put("A", 15);
        treeMap.put("Z", 5);
        treeMap.put("L", 250);
        System.out.println(treeMap);


    }
}
