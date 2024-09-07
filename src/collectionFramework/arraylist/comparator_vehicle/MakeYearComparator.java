package collectionFramework.arraylist.comparator_vehicle;


import java.util.Comparator;

public class MakeYearComparator implements Comparator<Vehicles> {
    @Override
    public int compare(Vehicles o1, Vehicles o2) {
        return o1.makeYear.compareTo(o2.makeYear);
    }
}
