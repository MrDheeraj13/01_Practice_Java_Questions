package com.java8.lambdaExpresion;

import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void main(String[] args) {
		int[] num = {11,34,56,77,65,43,21};
//		print even number and greater than 50
		
		Predicate<Integer> p1 = i->(i%2 == 0);
		Predicate<Integer> p2 = i->(i>50);
		for(int n :num ) {
//			1st way
//			if(p1.test(n) && p2.test(n)) {
//				System.out.println(n);
//			}
			
//			2nd way using 
//			and operator
			if(p1.and(p2).test(n))
			{
//				System.out.println(n);
			}
			
//			Or operator
			if(p1.or(p2).test(n)) {
//				System.out.println(n);
			}
			
//			negate method
			if(p1.negate().test(n)) {
				System.out.println(n);
			}
		}
	}

}
