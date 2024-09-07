package collectionFramework.arraylist.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortingByCountry{
    String name;
    int age;
    String country;

    public SortingByCountry(String name, int age, String country){
        super();
        this.name = name;
        this.age = age;
        this.country =  country;
    }
}

public class Problem3SortByCountry {
    public static void main(String[] args) {
        List<SortingByCountry> list = new ArrayList<>();
        list.add(new SortingByCountry("Alex", 23, "USA"));
        list.add(new SortingByCountry("Dave", 34, "India"));
        list.add(new SortingByCountry("Carl", 21, "USA"));
        list.add(new SortingByCountry("Joe", 56, "Russia"));
        list.add(new SortingByCountry("Amit", 64, "China"));
        list.add(new SortingByCountry("Ryan", 19, "Brazil"));

        System.out.println("Sorting all the employees by country name");
        Collections.sort(list, (e1, e2) -> e1.country.compareTo(e2.country));

        for (SortingByCountry emp : list) {
            System.out.println("Employee Name: " + emp.name + ", Employee Country: " + emp.country);
        }
    }
}
