package Amadeus;
import java.util.Arrays;
import java.util.List;

class Employee {
    int id;
    String name;
    int age;
    long salary;

    // Constructor
    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to increase salary by 5% if age > 40
    public void increaseSalary() {
        if (this.age > 40) {
            this.salary += this.salary * 0.05; // 5% increment
        }
    } 

    public long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
            new Employee(1, "John", 45, 50000),
            new Employee(2, "Alice", 38, 60000),
            new Employee(3, "Bob", 50, 70000)
        );

        // Increase salary for employees over the age of 40
        employees.forEach(Employee::increaseSalary);

        // Sum the salaries of employees whose salary was raised (age > 40)
        long raisedSalaryTotal = employees.stream()
            .filter(emp -> emp.getAge() > 40)  // Filter employees over 40
            .mapToLong(Employee::getSalary)     // Map to their salary
            .sum();                             // Sum the salaries

        // Print the total raised salary
        System.out.println("Total salary of employees whose salary was raised: " + raisedSalaryTotal);
    }
}
