package collectionframework.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FetchUpdateRemove {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("Oracle", 56);
        stockPrice.put("Fivers", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Apple", 150);

        //fetching
        System.out.println(stockPrice.get("Oracle"));
        //Since Google is not present in our Map, this will insert it with default value of 100.
        System.out.println(stockPrice.getOrDefault("Google", 100));
        System.out.println(stockPrice);
        System.out.println(stockPrice.getOrDefault("Amazon", 10));

        //replacing
        System.out.println(stockPrice.replace("BMW", 73, 83));
        System.out.println(stockPrice);
        System.out.println(stockPrice.replace("Oracle", 98));
        System.out.println(stockPrice);
        //replaceAll
        stockPrice.replaceAll((k, v) -> v + 10);
        System.out.println(stockPrice);

        //Removing
        stockPrice.remove("Oracle");
        System.out.println(stockPrice);
    }
}