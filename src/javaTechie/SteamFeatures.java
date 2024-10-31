 package javaTechie;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamFeatures {
	public static void main(String[] args) {
	/*
	 * 1.Stream.ofNullable
	 * 2.stream.iterator
	 * 3.collectors.collectingAndThen
	 * 4.Stream.takeWhile and Stream.dropWhile
	 * 5.Collectors.teeing()
	 * 6.stream.concat()
	 * 7.collectores.partitioningBy
	 * 8.IntStream for Range
	*/
		
		
		List<String> list = Arrays.asList("tim","pen",null,"sam",null,"bob","lily",null,"Alice","suzan");
//		print list without null value
//		List<String> listWithoutNull = list.stream()
//				.filter(l -> l!=null)
//				.collect(Collectors.toList());
//
//		System.out.println(listWithoutNull);
//		using ofNullable
//		List<String> result = list.stream()
//				.flatMap(Stream::ofNullable)
//				.collect(Collectors.toList());
//		
//		System.out.println(result);
		
//		------------------------------------------------------
		
//		iterate method
//		fibonacci series
//		Stream.iterate(new int[] {0,1},f-> new int[] {f[1],f[0]+f[1]})
//		.limit(10)
//		.map(f ->f[0])
//		.forEach(System.out::println);
//		Stream.iterate(0, n->n+2).limit(10).forEach(System.out::println);
		
//		----------------------------------------
//		find the avg salary
		
		Map<String,Integer> Employee = new HashMap<>();
		Employee.put("tom", 1200);
		Employee.put("bob", 1000);
		Employee.put("lily", 1800);
		Employee.put("sam", 1700);
		Employee.put("peter", 1400);
		Employee.put("Alice", 2100);
		
		
		
		
	}

}
