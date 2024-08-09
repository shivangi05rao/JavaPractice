package collectionframework.arraylist.comparator_vehicle;


import java.util.Comparator;

public class BrandComparator implements Comparator<Vehicles>{

    @Override
    public int compare(Vehicles o1, Vehicles o2) {
        return o1.brand.compareTo(o2.brand);
    }
}
