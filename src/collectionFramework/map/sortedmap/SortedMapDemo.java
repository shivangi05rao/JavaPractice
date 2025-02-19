package collectionFramework.map.sortedmap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        //SortedMap is an interface that extends the Map interface which guarantees
        // that the entries are sorted based on the keys, either in their natural ordering or by specified comparator.
        SortedMap<String, Integer>  sortedMap = new TreeMap<>((a ,b) -> b.compareTo(a));
        sortedMap.put("Shivangi", 99);
        sortedMap.put("Shailza", 91);
        sortedMap.put("Aditi", 85);
        sortedMap.put("Gaurav", 96);
        sortedMap.put("Vibhav", 92);
        System.out.println(sortedMap);

        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap("Shivangi"));
        System.out.println(sortedMap.tailMap("Gaurav"));

        System.out.println(sortedMap.subMap("Shailza", "Aditi"));

        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "One");
        navigableMap.put(5, "Five");
        navigableMap.put(3, "Three");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerEntry(4));
        System.out.println(navigableMap.ceilingEntry(4));
        System.out.println(navigableMap.descendingMap());
    }
}
