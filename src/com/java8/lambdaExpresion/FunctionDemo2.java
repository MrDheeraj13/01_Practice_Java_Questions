package com.java8.lambdaExpresion;

import java.util.function.Function;

public class FunctionDemo2 {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = n->n*2;
		Function<Integer, Integer> f2 = n->n*n*n;
		System.out.println("andThen() method : "+f1.andThen(f2).apply(2));
		System.out.println("compose() method : "+f1.compose(f2).apply(2));
		

	}

}
