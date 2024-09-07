package collectionFramework.arraylist.comparator_vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vehicles {

    String brand;
    Integer makeYear;

    public Vehicles(String brand, Integer makeYear) {
        super();
        this.brand = brand;
        this.makeYear = makeYear;
    }

    public static void main(String[] args) {
        List<Vehicles> list = new ArrayList<>();
        list.add(new Vehicles("Volkswagen", 2010));
        list.add(new Vehicles("Audi", 2009));
        list.add(new Vehicles("Ford", 2001));
        list.add(new Vehicles("BMW", 2015));

        System.out.println("Sorting by brand name.");
        Collections.sort(list, new BrandComparator());
        for (Vehicles vehicle : list) {
            System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.makeYear);
        }

        System.out.println("Sorting by make year.");
        Collections.sort(list, new MakeYearComparator());
        for (Vehicles vehicle : list) {
            System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.makeYear);
        }
    }
}

