package java8.comparatorPractice;


import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 24);
        Employee emp2 = new Employee("Tom", 54);
        Employee emp3 = new Employee("Tony", 99);
        Employee emp4 = new Employee("Jena", 41);

        List<Employee> list = new ArrayList<>(Arrays.asList(emp1, emp2, emp3, emp4));
//        System.out.println(list);
//        Collections.sort(list, new EmployeeName());
//        System.out.println("After sorting by name: " + list);

        Stream<Employee> employeeStream = list.stream();
        employeeStream.forEach(v -> System.out.println(v.getName()));
    }
}

class EmployeeName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}


interface d{
    default void myName(){
        System.out.println("Shivangi");
    }
}

class a implements d {
    public static void main(String[] args) {
        a a = new a();
        a.myName();
    }
}


