package collectionFramework.map.identityhashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        //IdentityHashMap is a special type of Map that compares keys using reference equality (==) instead of equals().
        // This means two keys are considered different even if they have the same content, as long as they are different objects in memory.
        String key1 = new String("key");
        String key2 = new String("key");

        Map<String, Integer> map = new IdentityHashMap<>();
        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);
    }

    public static class ImmutableMapDemo {
        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            map.put("Shivangi", 1);
            map.put("Shailza", 3);
            map.put("Gaurav", 7);

            System.out.println(map);
            Map<String, Integer> map2 = Collections.unmodifiableMap(map);
            System.out.println(map2);

            Map<String, Integer> map1 = Map.of("Aditi", 2, "Urmila", 9, "Rajendra", 10);
            map1.put("Vibhav", 11); //UnsupportedOperationException

            Map<String, Integer> original = new HashMap<>();
            original.put("A", 1);
            Map<String, Integer> immutableMap = Map.copyOf(original);
            immutableMap.put("ABC", 6);  //UnsupportedOperationException
        }
    }
}
