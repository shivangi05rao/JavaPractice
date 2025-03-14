package java8.javaComparatorUsingAnonymousClass;

import java.util.Comparator;
import java.util.List;

public class PersonService{
    public static List<Person> getPersons(List<Person> personList){
        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        return personList;
    }
}
