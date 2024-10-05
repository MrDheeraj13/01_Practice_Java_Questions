package askedquestions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    long salary;

    Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class EyTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Alice", 60000));
        employees.add(new Employee("John", 70000));
        employees.add(new Employee("Bob", 55000));
        employees.add(new Employee("Alice", 45000));

        employees.stream()
        .sorted(Comparator.comparing(Employee::getName)
        		.thenComparing(Employee::getSalary).reversed()).collect(Collectors.toList());
       
    }
}
