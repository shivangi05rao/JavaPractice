package collectionFramework.map.linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//LinkedHashMap is a subclass of HashMap that maintains the insertion order of elements.
// It internally uses a doubly linked list along with the hash table.
//It can also be set to access order, meaning the most recently accessed element moves to the end (useful for LRU caching).
// Performance is similar to HashMap (O(1) for put/get/remove), but it uses more memory due to extra pointers.
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 13);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getKey());
        }

        System.out.println();
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Orange", 10);
        hashMap.put("Apple", 20);
        hashMap.put("Guava", 13);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getKey());
        }
    }
}
