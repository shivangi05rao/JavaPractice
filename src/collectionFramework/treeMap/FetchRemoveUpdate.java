package collectionFramework.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class FetchRemoveUpdate {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        treeMap1.put("Oracle", 43);
        treeMap1.put("Microsoft", 56);
        treeMap1.put("Apple", 76);
        treeMap1.put("Novartis", 87);
        treeMap1.put("Google", 65);
        treeMap1.put("Audi", 32);
        System.out.println(treeMap1);

        //Using get()
        int val = treeMap1.get("Apple");
        System.out.println(val);

        //Fetching the smallest key
        Map.Entry<String, Integer>  firstEntry = treeMap1.firstEntry();
        System.out.println("The key: " + firstEntry.getKey() + " The value: " + firstEntry.getValue());

        //Fetching the largest key
        Map.Entry<String, Integer>  lastEntry = treeMap1.lastEntry();
        System.out.println("The key: " + lastEntry.getKey() + " The value: " + lastEntry.getValue());


        //Removing
        System.out.println("Removing Google: " + treeMap1.remove("Google"));


        //Updating
        System.out.println(treeMap1.replace("Audi", 98));
        System.out.println(treeMap1.get("Audi"));

        System.out.println("Replacing the value of Apple only if current value is 50 : " + treeMap1.replace("Apple", 50, 90));
        System.out.println("Latest value of Oracle : " + treeMap1.get("Apple"));

        System.out.println("Replacing the value of Apple only if current value is 76 : " + treeMap1.replace("Apple", 76, 90));
        System.out.println("Latest value of apple : " + treeMap1.get("Apple"));
    }
}
