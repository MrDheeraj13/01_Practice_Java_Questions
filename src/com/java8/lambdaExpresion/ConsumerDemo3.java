package com.java8.lambdaExpresion;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Emp{
	String name;
	int salary;
	String gender;
	public Emp(String name, int salary, String gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}
	
}

public class ConsumerDemo3 {

	public static void main(String[] args) {
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		emplist.add(new Emp("Dheeraj",86000,"m"));
		emplist.add(new Emp("Alex",96000,"m"));
		emplist.add(new Emp("Lili",66000,"f"));
		emplist.add(new Emp("Laura",87000,"f"));
	}
	
	Function<Emp, Integer> fn = emp ->(emp.salary*10)/100;
	
	Predicate<Integer> pr = p -> p>5000;
	
	Consumer<Emp> c = emp ->{
		System.out.println(emp.name);
		System.out.println(emp.salary);
		System.out.println(emp.gender);
	};
	
//	for(Emp e :emplist ) {
//		int bonas = fn.apply(e);
//		if(pr.test(bonas))
//		{
//			c.accept(e);
//			System.out.println("Employee :"+bonas);
//		}
//	}

}

