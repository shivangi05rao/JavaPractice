package collectionFramework.arraylist.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Vehicle implements Comparable<Vehicle>{
    String brand;
    Integer makeYear;

    public Vehicle(String brand, Integer makeYear){
        super();
        this.brand = brand;
        this.makeYear = makeYear;
    }


    @Override
    public int compareTo(Vehicle vehicle) {
        return this.makeYear - vehicle.makeYear;
    }

    //On the basis of brand name
//        @Override
//        public int compareTo(Vehicle o) {
//            //Using the compareTo() method of String class.
//            return this.brand.compareTo(o.brand);
//        }
}
public class SortingVehicleUsingCompareTo {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle("Volkswagen", 2010));
        list.add(new Vehicle("Audi", 2009));
        list.add(new Vehicle("Ford", 2001));
        list.add(new Vehicle("BMW", 2015));

        //for loop
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++){
            Vehicle vehicle = list.get(i);
            System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.makeYear);
        }

        //enhanced for loop
        for (Vehicle vehicle : list){
            System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.makeYear);

        }


    }
}
