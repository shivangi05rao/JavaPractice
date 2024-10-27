package java8.methodReferences;

import java.util.ArrayList;
import java.util.List;

public class ConstructorReferences {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dave");
        list.add("Joe");
        list.add("Ryan");
        list.add("Ian");
        list.add("Ray");

        // Code without constructor reference
        list.stream()
                .map(name -> new Employee(name))
                .forEach(v -> System.out.println(v.name));

        // Code with constructor reference
        list.stream()
                .map(Employee::new)
                .forEach(System.out::println);
    }
}

class Employee {
    String name;
    int age;
    int salary;

    Employee(String name) {
        this.name = name;
    }

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
