package collectionFramework.map.linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CreatingAndInserting {
    public static void main(String[] args) {
        /*//no-args constructor
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        //Constructor takes initial capacity
        LinkedHashMap<String, Integer> linkedHashMap1 = new LinkedHashMap<>(5);

        //Using Constructor takes initial capacity and load factor
        LinkedHashMap<String, Integer> linkedHashMap2 = new LinkedHashMap<>(5, 0.75f);

        //Constructor takes initial capacity and load factor and boolean access order
        //with the access order flag as true. Now the elements that were accessed most recently will be kept at the last position.
        LinkedHashMap<String, Integer> linkedHashMap3 = new LinkedHashMap<>(5, 0.75f, true);*/

        //Constructor that takes another Map
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 123);
        LinkedHashMap<String, Integer> linkedHashMap4 = new LinkedHashMap<>(hashMap);
        System.out.println(linkedHashMap4);

        HashMap<String, Integer> stocks = new LinkedHashMap<>(16, 0.75f, true);

        stocks.put("Apple", 123);
        stocks.put("BMW", 54);
        stocks.put("Google", 87);
        stocks.put("Microsoft", 232);
        stocks.put("Oracle", 76);

        stocks.get("BMW");
        stocks.get("Google");
        System.out.println(stocks);

    }
}
