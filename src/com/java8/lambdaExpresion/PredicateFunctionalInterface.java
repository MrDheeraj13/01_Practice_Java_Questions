package com.java8.lambdaExpresion;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {

	public static void main(String[] args) {
//		check if value is greater than 10 or not
		
		Predicate<Integer> pr = i -> (i>10);
		System.out.println(pr.test(21));
		System.out.println(pr.test(10));
//		check the length of string is greater than 4 or not
		
		Predicate<String> p = s->(s.length()>5);
		System.out.println(p.test("Love to code."));
		System.out.println(p.test("code."));
		
//		print the array element whose size is greater than 5
		String[] names = {"Dheeraj", "peter","john","Hassan","Aditya"};
		for(String name:names) {
			
			if(p.test(name)) {
				System.out.println(name);
			}
			
			
//			if(name.length()>5) {
//				System.out.println(name);
//			}
		}
		
		
	}

}
