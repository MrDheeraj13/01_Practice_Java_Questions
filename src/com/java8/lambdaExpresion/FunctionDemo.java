package com.java8.lambdaExpresion;

import java.util.ArrayList;
import java.util.function.Function;

class Employees{
	String name;
	int salary;
	
	
	public Employees(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
}

public class FunctionDemo {

	public static void main(String[] args) {
		
		ArrayList<Employees> empList = new ArrayList<>();
		empList.add(new Employees("Dheeraj",84000));
		empList.add(new Employees("Dheeraj K",100000));
		empList.add(new Employees("Dheeraj kr",120000));
		
		
		Function<Employees, Integer> fn = e->{
			int sal = e.salary;
			if(sal > 75000 && sal<85000) {
				return (sal*10/100);
			}
			if(sal > 85000 && sal<95000) {
				return (sal*20/100);
			}
			if(sal > 95000 && sal<105000) {
				return (sal*30/100);
			}
			else {
				return (sal*40/100);
			}
			
		};
		
		
		for(Employees emp:empList)
		{
			int bonas = fn.apply(emp);
			System.out.println(bonas);
		}
		
	}

}
