package java8.javaComparatorUsingAnonymousClass;

import java8.comparatorusinglambda.ComparatorLambdaPersonService;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John" , 23 , "USA"));
        personList.add(new Person("Carl" , 23 , "Australia"));
        personList.add(new Person("Amit" , 23 , "India"));
        personList.add(new Person("Vikram" , 23 , "Bhutan"));
        personList.add(new Person("Kane" , 23 , "Brazil"));

        List<Person> sortedPerson = PersonService.getPersons(personList);
        System.out.println("Persons after sorting");
        for (Person person : sortedPerson){
            System.out.println("Person name: " + person.getName());
        }

        List<Person> sortedPerson1 = ComparatorLambdaPersonService.getPersons1(personList);
        System.out.println("Persons after sorting");
        for (Person person : sortedPerson1){
            System.out.println("Person name: " + person.getName());
        }
    }
}
