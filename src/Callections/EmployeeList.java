package Callections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeList {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee (1, 500));
		empList.add(new Employee (2, 1000));
		empList.add(new Employee (3, 1500));
		empList.add(new Employee (4, 2000)); 
		empList.add(new Employee (5, 2500));
		empList.add(new Employee (6, 3000)); 
		empList.add(new Employee (7, 3500));

//		Fetch top 3 salaried employees details ?
		List<Employee> sortedList = empList.stream().sorted((o1,o2)->(o2.getSalary()-o1.getSalary())).limit(3).collect(Collectors.toList());
//		System.out.println(empList);
		System.out.println(sortedList);
		
//		Fetch all employees having salary less than 3rd highest salary ?
		List<Employee> salarylessthanThird = empList.stream()
				.sorted((o1,o2)->(o2.getSalary()-o1.getSalary()))
				.skip(3)
				.collect(Collectors.toList());
		System.out.println(salarylessthanThird);
		
//		Find sum all elements in an array using java 8 ?
//				Input: {2,3,4,5,7)
		
		int[] input ={2,3,4,5,7};
//		int sum =0;
//		for(int i=0;i<input.length;i++) {
//			sum +=input[i]; 
//		}
//		System.err.println(sum);
		System.out.println(Arrays.stream(input).sum());
		

		
		
	}
	

	
}

