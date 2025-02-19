package collectionFramework.map.enummap;

import org.w3c.dom.ls.LSOutput;

import java.util.EnumMap;
import java.util.Map;
//EnumMap is a special type of Map that works only with enum keys. It is faster and uses less memory
// than HashMap because it stores values in an array instead of hashing. It also keeps the order of enum keys as defined in the enum.
public class EnumMapDemo {
    public static void main(String[] args) {
        //array of size same as enum
        //no hashing
        //ordinal/index is used
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Gym");
        map.put(Day.MONDAY, "Study");
        System.out.println(Day.TUESDAY.ordinal()); //index
        System.out.println(map);

        Thread thread = new Thread(() -> {
            System.out.println("Hello!");
        });

    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


