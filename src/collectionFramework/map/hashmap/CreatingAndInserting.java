package collectionFramework.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CreatingAndInserting {
    public static void main(String[] args) {
        //Using the no-arg constructor
        Map<String, Integer> map = new HashMap<>();
        map.put("Oracle", 50);  //Inserting share price of Oracle in the Map.
        map.put("Oracle", 60); //Inserting share price of Oracle again. This will update the value.
        map.putIfAbsent("TCS", 80);

        System.out.println(map);


        //Using the constructor that takes initial capacity
        Map<String, Integer> map1 = new HashMap<>(16);
        map1.putAll(map);
        System.out.println(map1);

        //Using the constructor that takes initial capacity and load factor
        Map<String, Integer> map2 = new HashMap<>(16, 0.75f);
        System.out.println(map2);


        //Using the constructor that takes another Map as a parameter
        Map<String, Integer> map3 = new HashMap<>(map1);
        System.out.println(map3);
    }
}
