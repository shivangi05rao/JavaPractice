package java8.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class IsPresent {
    Map<Integer, Employee> employeeMap = new HashMap<>();

    public void populateEmployee() {
        employeeMap.put(123, new Employee("Alex", 23, 12000));
    }

    public Optional<Employee> getEmployee(Integer employeeId) {
        return Optional.ofNullable(employeeMap.get(employeeId));
    }


    public static void main(String[] args) {
        IsPresent demo = new IsPresent();
        demo.populateEmployee();
        Optional<Employee> emp = demo.getEmployee(123);
        emp.ifPresent(System.out::println);
    }
//    Optional<String> optional = Optional.ofNullable(null);
//    // This will throw exception because optional contains a null value.
//        System.out.println(optional.get());

    //Optional<String> optional = Optional.ofNullable(null);
    //        // This will return the default value.
    //        System.out.println(optional.orElse("default string"));


}

