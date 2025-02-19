package collectionFramework.map.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//HashMap is a data structure that stores elements in key-value pairs using hashing.
// Each key is unique, and values can be duplicated. It allows one null key and multiple null values. Not thread safe.
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "Shivangi");
        map.put(331, "Gaurav");
        map.put(2, "Shailza");
        map.put(14, "Aditi");
        System.out.println(map);

        System.out.println(map.get(3));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Shivangi"));

        for (int i : map.keySet()) {
            System.out.print(map.get(i) + " ");
        }

        System.out.println();
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            entry.setValue(entry.getValue().toUpperCase() + " ");
        }

        System.out.println(map);
        map.remove(331);
        System.out.println(map);

        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>(map);
        System.out.println(map1);
    }
}
