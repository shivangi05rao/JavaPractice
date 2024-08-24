package collectionframework.hashmap.question;

import java.util.HashMap;
import java.util.Map;

public class EmployeeCustomHashMapHashCodeEquals {
    int empId;
    String empName;

    EmployeeCustomHashMapHashCodeEquals(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + empId;
        result = prime * result + ((empName == null) ? 0 : empName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        EmployeeCustomHashMapHashCodeEquals e = (EmployeeCustomHashMapHashCodeEquals) obj;
        return this.empId == e.empId;
    }

    public static void main(String[] args) {
        EmployeeCustomHashMapHashCodeEquals e1 = new EmployeeCustomHashMapHashCodeEquals(123, "Jane");
        EmployeeCustomHashMapHashCodeEquals e2 = new EmployeeCustomHashMapHashCodeEquals(123, "Jane");

        Map<EmployeeCustomHashMapHashCodeEquals, Integer> emap = new HashMap<>();
        emap.put(e1, 56000);
        emap.put(e2, 45000);

        for (Map.Entry<EmployeeCustomHashMapHashCodeEquals, Integer> entry : emap.entrySet()) {
            System.out.println("Employee Id: " + entry.getKey().empId + ", Employee Name:" + entry.getKey().empName);
        }
    }
}
