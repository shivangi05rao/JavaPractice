package collectionFramework.treeMap;

import java.sql.SQLOutput;
import java.util.*;

import static java.util.Map.Entry.comparingByKey;

public class SortingHashMap {
    public static void main(String[] args) {
        Map<Integer, String> empMap = new HashMap<>();
        empMap.put(123, "Alex");
        empMap.put(342, "Ryan");
        empMap.put(143, "Joe");
        empMap.put(234, "Allen");
        empMap.put(432, "Roy");


        //Using TreeMap
        TreeMap<Integer, String> sortedEmpMap = new TreeMap<>();
        sortedEmpMap.putAll(empMap);
        System.out.println(sortedEmpMap);

        //Using ArrayList by keys
        List<Integer> empKey = new ArrayList<>(empMap.keySet());
        Collections.sort(empKey);
        System.out.println(empKey);

        //By values
        List<String> empValues = new ArrayList<>(empMap.values());
        Collections.sort(empValues);
        System.out.println(empValues);

        //Using Lambdas and streams
        System.out.println("Sorting by key: ");
        empMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("Sorting by values");
        empMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
