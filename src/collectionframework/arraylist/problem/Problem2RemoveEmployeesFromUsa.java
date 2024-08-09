package collectionframework.arraylist.problem;

import java.util.*;
import java.util.stream.Collectors;

class EmployeesUsa { //implements Comparable<EmployeesUsa>{
    String name;
    int age;
    String country;

    public EmployeesUsa(String name, int age, String country){
        super();
        this.name = name;
        this.age = age;
        this.country = country;
    }

//    @Override
//    public int compareTo(EmployeesUsa o) {
//        return this.country.compareTo(o.country);
//    }
}

public class Problem2RemoveEmployeesFromUsa {
    public static void main(String[] args) {
        List<EmployeesUsa> list = new ArrayList<>();
        list.add(new EmployeesUsa("Alex", 23, "USA"));
        list.add(new EmployeesUsa("Dave", 34, "India"));
        list.add(new EmployeesUsa("Carl", 21, "USA"));
        list.add(new EmployeesUsa("Joe", 56, "Russia"));
        list.add(new EmployeesUsa("Amit", 64, "China"));
        list.add(new EmployeesUsa("Ryan", 19, "Brazil"));

        /*//Using for loop for extracting USA employees
        for (int i = 0; i < list.size(); i++){
            EmployeesUsa emp = list.get(i);
            if (emp.country == "USA"){
                System.out.println("The employee from USA is: " + emp.name);
            }
        }
        System.out.println();

        //For removing USA Employees
        Iterator<EmployeesUsa> itr = list.iterator();
        while (itr.hasNext()){
            if (itr.next().country.equals("USA")){
                itr.remove();
            }
        }
        //Using enhanced loop
        for (EmployeesUsa emp : list) {
            System.out.println("Employee Name: " + emp.name + ", Employee Country: " + emp.country);
        }
*/
        //Using removeIf
        list.removeIf(employeesUsa -> employeesUsa.country.equals("USA"));
        list.forEach(employeesUsa -> System.out.println(employeesUsa.name + " (" + employeesUsa.country + ")"));

        //Using stream api to filter and collect
        list.stream()
                .filter(employeesUsa -> !employeesUsa.country.equals("USA"))
                .collect(Collectors.toList());
        list.forEach(employeesUsa -> System.out.println(employeesUsa.name + " (" + employeesUsa.country + ")"));

       /* //Using a Temporary List with Enhanced For Loop
        List<EmployeesUsa> nonUsaEmployee = new ArrayList<>();
        for (EmployeesUsa emp : list){
            if (!emp.country.equals("USA")){
                nonUsaEmployee.add(emp);
            }
        }
        list = nonUsaEmployee;
        list.forEach(employeesUsa -> System.out.println(employeesUsa.name + " (" + employeesUsa.country + ")"));*/

        //Using a Custom Comparator to Sort and Then Remove
        list.sort(Comparator.comparing(employeesUsa -> employeesUsa.country.equals("USA")));
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).country.equals("USA")) {
                list.remove(i);
            }
        }
        list.forEach(emp -> System.out.println(emp.name + " (" + emp.country + ")"));

        //Using Iterator
        Iterator<EmployeesUsa> iterator = list.iterator();
        while (iterator.hasNext()){
            EmployeesUsa emp = iterator.next();
            if (emp.country.equals("USA")){
                iterator.remove();
            }
        }

        System.out.println("List after removing employees from USA:");
        for (EmployeesUsa emp : list) {
            System.out.println("Employee Name: " + emp.name + ", Employee Country: " + emp.country);
        }
    }
}
