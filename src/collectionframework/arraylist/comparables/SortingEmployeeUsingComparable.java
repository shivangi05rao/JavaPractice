package collectionframework.arraylist.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    String name;
    int age;

    public Employee(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee employee) {
        return (this.age - employee.age);
    }
}


public class SortingEmployeeUsingComparable {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Jane", 29));
        list.add(new Employee("Alex", 54));
        list.add(new Employee("Matt", 19));
        list.add(new Employee("Roy", 72));

        Collections.sort(list);
        //for loop
        for (int i = 0; i < list.size(); i++) {
            Employee emp = list.get(i);
            System.out.println("Employee Name: " + emp.name + ", Employee Age: " + emp.age);
        }
        //enhanced for loop
        for (Employee emp : list) {
            System.out.println("Employee Name: " + emp.name + ", Employee Age: " + emp.age);
        }
    }
}
