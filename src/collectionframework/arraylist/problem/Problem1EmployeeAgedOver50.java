package collectionframework.arraylist.problem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee { //implements Comparable<Employee>{
    String name;
    int age;
    String country;

    public Employee(String name, int age, String country){
        super();
        this.name = name;
        this.age = age;
        this.country = country;
    }

    /*@Override
    public int compareTo(Employee employee) {
        return (this.age - employee.age);
    }*/
}

public class Problem1EmployeeAgedOver50 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));

        /*Collections.sort(list);
        System.out.println("Name of employees with age more than 50");
        for (int i = 0; i < list.size(); i++) {
            Employee employee = list.get(i);
            if (employee.age > 50) {
                System.out.println("Employee Name: " + employee.name + ", Employee Age: " + employee.age);
            }
        }
        System.out.println();

        //Solution using enhanced for loop
        System.out.println("Name of employees with age more than 50");
        for(Employee employee : list) {
            if(employee.age > 50) {
                System.out.println("Employee Name: " + employee.name + ", Employee Age: " + employee.age);
            }
        }

        System.out.println();
        //Solution using streams
        System.out.println("Solution using streams");
        list.stream().filter(employee -> employee.age > 50).map(employee -> "Employee Name: " + employee.name + ", Employee Age: "
                + employee.age).forEach(System.out::println);
*/


        //Without using comparable class interface
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.age - o2.age);
            }
        });

        System.out.println("Name of employees with age more than 50");
        for(Employee employee : list) {
            if(employee.age > 50) {
                System.out.println("Employee Name: " + employee.name + ", Employee Age: " + employee.age);
            }
        }

        //For loop
        for (int i = 0; i < list.size(); i++){
            Employee emp = list.get(i);
            if (emp.age > 50) {
                System.out.println("Employee Name: " + emp.name + ", Employee Age: " + emp.age);
            }
        }

        //Using Stream
        list.stream()
                .filter(employee -> employee.age > 50)
                .map(employee -> "Employee Name: " + employee.name + ", Employee Age: "
                        + employee.age)
                .forEach(System.out::println);
    }
}
