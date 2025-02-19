package collectionFramework.map.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;
//ConcurrentHashMap is basically a thread-safe version of a HashMap.
// It’s designed to handle situations where multiple threads are reading from and writing to the map at the same time.
// It doesn’t lock the entire map when one thread is accessing it—instead,
// it divides the data into segments(16 segments) and locks only the necessary parts .
// This makes it way more efficient than something like Hashtable, which locks the whole map and can slow things down.
public class CreatingAndInserting {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> stocks = new ConcurrentHashMap<>();

        stocks.put("Google", 123);
        stocks.put("Microsoft", 654);
        stocks.put("Apple", 345);
        stocks.put("Tesla", 999);

        System.out.println(stocks);

        // Since we are using putIfAbsent(), and Apple is already in the Map, the value will not be added.
        stocks.putIfAbsent("Apple", 1000);

        System.out.println(stocks);
    }
}
