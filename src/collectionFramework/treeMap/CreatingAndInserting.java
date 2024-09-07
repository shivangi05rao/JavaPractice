package collectionFramework.treeMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class CreatingAndInserting {
    public static void main(String[] args) {
        //Using a no-arg constructor
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 1);
        treeMap.put("Mango", 2);
        System.out.println(treeMap);


        //Using the constructor with Comparator as an argument
        TreeMap<String, Integer> treeMap1 = new TreeMap<>(Comparator.reverseOrder());
        treeMap1.put("Oracle", 43);
        treeMap1.put("Microsoft", 56);
        treeMap1.put("Apple", 43);
        treeMap1.put("Novartis", 87);
        System.out.println("Elements are stored in reverse order: " + treeMap1);


        //Using constructor with the argument of type Map
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Oracle", 43);
        hashMap.put("Microsoft", 56);
        hashMap.put("Apple", 43);
        hashMap.put("Novartis", 87);
        System.out.println("Elements are stored in random order: " + hashMap);

        TreeMap<String, Integer> treeMap2 = new TreeMap<>(hashMap);
        System.out.println("Elements are stored in ascending order: " + treeMap2);

        //Using constructor with the argument of type SortedMap
        TreeMap<String, Integer> treeMap4 = new TreeMap<>(treeMap1);
        System.out.println("Elements are stored in descending order: " + treeMap4);


        //Inserting using put() and putAll()
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 43);
        map.put("Novartis", 87);

        TreeMap<String, Integer> finalMap = new TreeMap<>();
        map.put("Google", 65);
        map.put("Audi", 32);
        finalMap.putAll(map);

        System.out.println("All entry in finalMap : " + finalMap);
    }
}
