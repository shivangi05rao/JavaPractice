package collectionFramework.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapJava8Implementations {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("India", 5);
        map.put("France", 4);
        map.put("Germany", 3);
        map.put("United States", 1);
        System.out.println(map);

        map.compute("India", (k, v) -> v == null ? 10 : v + 1);

        map.compute("Vietnamese", (k, v) -> v == null ? 10 : v + 1);
        System.out.println(map);

        map.computeIfAbsent("Paris", k -> k.length());
        System.out.println(map);


        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Jay", 5000);
        map1.put("Rahul", 3000);
        map1.put("Nidhi", 4500);
        map1.put("Amol", 60000);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Jay", 7000);
        map2.put("Rahul", 4500);
        map2.put("Nidhi", 1200);
        map2.put("Saurav", 25000);

        map1.forEach((key,value) -> map2.merge(key, value, (v1, v2) -> v1 + v2));

        System.out.println(map2);
    }
}
