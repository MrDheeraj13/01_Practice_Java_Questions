package askedquestions;

import java.util.*;
import java.util.stream.Collectors;

class TestEmployee {
    private int id;
    private String name;
    private String department;
    private Integer managerId;

    public TestEmployee(int id, String name, String department, Integer managerId) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.managerId = managerId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getManagerId() {
        return managerId;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", managerId=" + managerId + "]";
    }
}

public class TestNTTData {

    public static void main(String[] args) {
        // List of employees
        List<TestEmployee> ls = Arrays.asList(
            new TestEmployee(1, "Dheeraj", "ABC", null),
            new TestEmployee(2, "Sumit", "ABC", 1),
            new TestEmployee(3, "Sachet", "ABC", 2)
        );

        // Step 1: Collect all managerIds
        Set<Integer> managerId = ls.stream()
        		.map(TestEmployee::getManagerId)
        		.filter(Objects::nonNull)
        		.collect(Collectors.toSet());

        // Step 2: Filter employees whose id is not in the list of managerIds
       List<TestEmployee> employeesWithoutReportees = ls.stream()
    		   .filter(e-> !managerId.contains(e.getId()))
    		   .collect(Collectors.toList());

        // Step 3: Print the result
        employeesWithoutReportees.forEach(System.out::println);
    }
}
