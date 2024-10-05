package com.java8.lambdaExpresion;

import java.util.function.Predicate;

public class DemoPredicate {

	public static void main(String[] args) {
		Predicate<Integer> p = i->(i>10);
//		System.out.println(p.test(20));
		
		Predicate<String> pr = s->(s.length()>5);
		
//		System.out.println(pr.test("Dheeraj"));
		
		
//		print array element whose size > 4
		
		String [] names = {"Dheeraj","Kumar","test","pop","twitter"};
		
		for(String name : names) {
			if(pr.test(name)) {
//				System.out.println(name);
		}}
		
		int num[] = {234,56,78,900,98,7};
		Predicate<Integer> nt = n->(n.valueOf(n%2) !=0);
		
		for(int n: num) {
			if(nt.test(n)) {
				System.out.println(n);
			}
		}
	}

}
