package java8.javaComparatorUsingAnonymousClass;

import java.util.List;

public class ComparatorLambdaPersonService {
    public static List<Person> getPersons1(List<Person> person1s){
        person1s.sort((p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        });
        return person1s;
    }
}
