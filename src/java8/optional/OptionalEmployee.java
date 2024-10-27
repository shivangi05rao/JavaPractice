package java8.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalEmployee {
    /*Java 8 Optional works as a container type for the value which is probably absent or null.
    Java Optional is a final class present in the java.util package.*/
    Map<Integer, Employee> employeeMap = new HashMap<>();
    public Optional<Employee> getEmployee(Integer employeeId) {
        return Optional.ofNullable(employeeMap.get(employeeId));
    }

    public static void main(String[] args) {
        OptionalEmployee employee = new OptionalEmployee();

        Optional<Employee> emp = employee.getEmployee(123);

        if (emp.isPresent()) {
            System.out.println(emp.get().getName());
        } else {
            System.out.println("No employee returned..");
        }
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

    public String getName(){
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
