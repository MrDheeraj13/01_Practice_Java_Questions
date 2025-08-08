package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8EmployeeQuestion {
	
//	Write a function to find the second highest salary from a list of Employee objects, where
	
	public void seconHighestSalary(List<Employee> ls) {
	 Optional<Employee> list = ls.stream()
	 .sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
		System.out.println(list);
	}

//	Create a method using streams to group a list of Employee objects by 
//	their department and return a Map<Department, List<Employee>>.
	
	public void employeeObj(List<Employee> ls){
		
		Map<String, List<Employee>> collect = ls.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(collect);
	}
	
	
	
	
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
	            new Employee(1, "Alice", 75000, "Engineering"),
	            new Employee(2, "Bob", 60000, "Engineering"),
	            new Employee(3, "Charlie", 70000, "Marketing"),
	            new Employee(4, "David", 50000, "Engineering"),
	            new Employee(5, "Eve", 90000, "HR"),
	            new Employee(6, "Frank", 75000, "Marketing"),
	            new Employee(7, "Grace", 80000, "HR"),
	            new Employee(8, "Hannah", 55000, "Finance"),
	            new Employee(9, "Ian", 62000, "Finance"),
	            new Employee(10, "Jane", 67000, "Marketing")
	        );
		
		Java8EmployeeQuestion list = new Java8EmployeeQuestion();
//		list.seconHighestSalary(employees);
		list.employeeObj(employees);
	}

}
