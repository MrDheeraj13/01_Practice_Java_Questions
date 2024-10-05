package com.java8.lambdaExpresion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

class Employee{
	String empname;
	int salary;
	int experiance;
	
//	public String getEmpname() {
//		return empname;
//	}
//
//	public void setEmpname(String empname) {
//		this.empname = empname;
//	}
//
//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//
//
//
//
//	public int getExperiance() {
//		return experiance;
//	}
//
//	public void setExperiance(int experiance) {
//		this.experiance = experiance;
//	}

	Employee(String name ,int sal,int exp) {
		empname = name;
		salary =sal;
		experiance = exp;
	}
	
}

public class Demo2Predicate {

	public static void main(String[] args) {
		Employee emp = new Employee("DHK",100000, 4);
//		empname whose sal >50000 and exp >3
		Predicate<Employee> pt = e->(e.salary>500000 && e.experiance>12);
		System.out.println(pt.test(emp));
		
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("DHK",100000, 4));
		emplist.add(new Employee("SUN",870000, 12));
		emplist.add(new Employee("JFB",580000, 14));
		emplist.add(new Employee("ILM",400000, 24));
		emplist.add(new Employee("SYN",890000, 15));
		
		for(Employee e:emplist) {
		
			if(pt.test(e)) {
				System.out.println(e.empname+" "+e.salary);
			}
		}
	}

}
