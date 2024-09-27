package java8.fucntionalInterface.predicate;

public class Person {
    public String name;
    public int age;
    public int yearOfService;

    public Person() {

    }

    public Person(String name, int age, int yearOfService) {
        this.name = name;
        this.age = age;
        this.yearOfService = yearOfService;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
