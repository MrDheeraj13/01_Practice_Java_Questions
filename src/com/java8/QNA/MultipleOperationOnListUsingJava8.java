package com.java8.QNA;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class MultipleOperationOnListUsingJava8 {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(23,45,67,188,76,54,10);
		
//		1- find out all the even numbers that exist in the list
//		ls.stream().filter(n->n%2 ==0).forEach(System.out::println);
		
//		2  find out all the numbers starting with 1
//		ls.stream().map(s -> s+"").filter(n->n.startsWith("1")).forEach(System.out::println);
		
//		3 find duplicate elements in a given integers list
		List<Integer> list = Arrays.asList(12,34,53,45,6,45);
		Set<Integer> set = new HashSet();
		
//		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		
//		list.stream().distinct().forEach(noDuplicateData -> System.out.println(noDuplicateData));
		
//		4 find the first element of the list using Stream
		
//		list.stream().findFirst().ifPresent(System.out::println);
		
//		5 find the total number of elements present in the list
		
//		Long count = list.stream().count();
//		System.out.println(count);
		
		
//		6 find the maximum value element
		int max = list.stream().max(Integer::compare).get();
//		System.out.println(max);
		
//		Sorted order
//		list.stream().sorted().forEach(System.out::println);
//		Sorted in reverse order
//		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}

}
