package InterviewCondingQuestions.airtel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveSalesEmployee {
    public static List<Employee> removeSalesEmployees(List<Employee> employees) {
        return employees.stream()
                .filter(employee -> !"Sales".equalsIgnoreCase(employee.department))
                .collect(Collectors.toList());
    }

    public static List<Employee> removeSalesEmp(List<Employee> employees) {
            employees.removeIf(employee -> "Sales".equalsIgnoreCase(employee.department));
            return employees;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Shivangi", "Engineering"));
        employees.add(new Employee(2, "Neha", "Sales"));
        employees.add(new Employee(3, "Aditi", "Electrical"));
        employees.add(new Employee(4, "Gaurav", "Engineering"));
        employees.add(new Employee(5, "Shailza", "Frontend"));

        System.out.println(removeSalesEmployees(employees));
        System.out.println(removeSalesEmp(employees));
    }
}

class Employee {
    int empNo;
    String name;
    String department;

    public Employee(int empNo, String name, String department) {
        this.empNo = empNo;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}


