package com.java8.stream_parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamEx {

	public static void main(String[] args) {
		long start= 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Plain stream look like :"+(end-start));
		System.out.println("===================================================");
		
		start = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Parallel Stream look like : "+(end-start));

		
	}

}
