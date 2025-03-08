package java8.functionalInterface.unaryOperator;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryDemo {
    public static void main(String[] args) {
        Person person = new Person();
        UnaryOperator<Person> operator =(p) -> {
            p.name = "John";
            p.age = 23;
            return p;
        };

        operator.apply(person);
        System.out.println("Person name: " + person.getName() + " Persons age: " + person.getAge());

        IntUnaryOperator operator1 = num -> num * num;
        System.out.println(operator1.applyAsInt(25));
    }
}

class Person {
    String name;
    int age;

    Person(){

    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

