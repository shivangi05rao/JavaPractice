package collectionframework.arraylist.comparator_vehicle;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VehicleAllOne {
    public static void main(String[] args) {
        List<Vehicles> list = new ArrayList<>();
        list.add(new Vehicles("Volkswagen", 2010));
        list.add(new Vehicles("Audi", 2009));
        list.add(new Vehicles("Ford", 2001));
        list.add(new Vehicles("BMW", 2015));
        System.out.println("Sorting by brand name");
//  Collections.sort(list, new Comparator<Vehicles>() {
//
//            @Override
//            public int compare(Vehicles o1, Vehicles o2) {
//                return o1.brand.compareTo(o2.brand);
//            }
//        });
        Collections.sort(list, Comparator.comparing(o -> o.brand));

        for (Vehicles vehicle : list) {
            System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.makeYear);
        }

        System.out.println("Sorting by make year");
        Collections.sort(list, Comparator.comparing(o -> o.makeYear));
        for (Vehicles vehicle : list) {
            System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.makeYear);
        }
    }
}
