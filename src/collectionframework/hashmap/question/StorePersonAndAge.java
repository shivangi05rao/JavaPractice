package collectionframework.hashmap.question;

import java.util.HashMap;
import java.util.Map;

public class StorePersonAndAge {
    public static void main(String[] args) {
        Map<String, Integer> personMap = new HashMap<>();
        personMap.put("Akash", 21);
        personMap.put("Yash", 16);
        personMap.put("Lav", 17);
        personMap.put("Hinrika", 19);
        personMap.put("Harry", 18);

        //Print map
        System.out.println(personMap);

        //Getting value of a key
        System.out.println(personMap.get("Yash")); //16
        System.out.println(personMap.get("Rahul")); //null

        //Changing value of a key
        personMap.put("Akash", 25); //Akash --> 25
        System.out.println(personMap.get("Akash"));

        //Removing a pair from hashMap
        System.out.println(personMap.remove("Akash")); //25
        System.out.println(personMap.remove("Ria")); //null

        //Checking if key exists in map
        System.out.println(personMap.containsKey("Ria")); //False
        System.out.println(personMap.containsKey("Yash"));  //True
        System.out.println(personMap.containsValue(18));

        //Adding new key if the new key is not present
        personMap.putIfAbsent("Shivangi", 13); //will enter
        personMap.putIfAbsent("Akash", 23); //will not enter
        System.out.println(personMap.get("Shivangi"));
        System.out.println(personMap);

        //Get all the keys in hashMap
        System.out.println(personMap.keySet());

        //Get all the values in hashMap
        System.out.println(personMap.values());

        //Get all the entry in hashMap
        System.out.println(personMap.entrySet());

        System.out.println();

        //Traversing all the entries in hashmap- multiple ways
        for (String key : personMap.keySet()) {
            System.out.println("Age of " + key + " is : " + personMap.get(key));
        }

        System.out.println();

        for (Map.Entry<String, Integer> entry : personMap.entrySet()) {
            System.out.println("Age of " + entry.getKey() + " is : " + entry.getValue());
        }

        System.out.println();

        for (var entry : personMap.entrySet()) {
            System.out.println("Age of " + entry.getKey() + " is : " + entry.getValue());
        }
    }
}
