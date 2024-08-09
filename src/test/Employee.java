package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private int age;
    private String email;

    public Employee() {

    }

    public Employee(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee("Shivangi Rao", 22, "shivangi05rao@gmail.com");
        Employee e2 = new Employee("Mahi", 78, "mahi78@gmail.com");
        Employee e3 = new Employee("Anu", 56, "rao98765anu@outlook.com");
        Employee e4 = new Employee("Dhiru Ambani", 12, "qwerty565@outlook.com");
        Employee e5 = new Employee("Mukesh Ambani", 11, "parrot767@outlook.com");

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            System.out.println("Name: " + employee.name);
        }

        for (int i = 0; i < employeeList.size(); i++){
            Employee employee = employeeList.get(i);
            if (employee.name.equals("Mahi")){
                System.out.println(employee.age);
            }
        }

        //Using java 8
        employeeList.stream()
                        .forEach(val -> System.out.println(val.age));


        employeeList.stream()
                .forEach(val -> {
                    String abc = "Hello ";
                    System.out.println(abc + val.name);
                });

        List<String> namesWhoseAgeIsGreaterThan20 = employeeList.stream()
                .filter(val -> val.age > 20)
                .map(val -> val.name)
                .toList();

        System.out.println(
                employeeList.stream()
                        .filter(employee -> employee.age > 50)
                        .count()
        );

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.age - o2.age;
            }
        });

        employeeList.sort((x, y) -> y.age - x.age);

        //System.out.println(namesWhoseAgeIsGreaterThan20);
    }
}





