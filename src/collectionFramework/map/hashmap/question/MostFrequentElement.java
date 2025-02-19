package collectionFramework.map.hashmap.question;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        Map<Integer, Integer> freq = new HashMap<>();
        int[] arr = {1, 3, 2, 1, 4, 1};
        for (int element : arr) {
            if (!freq.containsKey(element)) {
                freq.put(element, 1);
            } else {
                freq.put(element, freq.get(element) + 1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());

        int maxFrequency = -1;
        int ansKey = -1;
        for (int key : freq.keySet()) {
            if (freq.get(key) > maxFrequency) {
                maxFrequency = freq.get(key);
                ansKey = key;
            }
        }
        System.out.println("Max Frequency key: " + ansKey);
    }
}
