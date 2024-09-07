package collectionFramework.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UsingIterator {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("Oracle", 56);
        stockPrice.put("Fivers", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Apple", 150);

        //Using for loop
        for (Map.Entry<String, Integer> entry : stockPrice.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //Using iterator
        Set<Map.Entry<String, Integer>> entries = stockPrice.entrySet();
        Iterator<Map.Entry<String, Integer>> itr = entries.iterator();

        while (itr.hasNext()){
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());

            if (entry.getKey().equals("Oracle")){
                itr.remove();
            }
        }
        System.out.println(stockPrice);

        //Using forEach()
        stockPrice.forEach((key, value) -> System.out
                .println("Company Name: " + key + " Stock Price: " + value));    }
}
