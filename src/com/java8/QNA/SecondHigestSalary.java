package com.java8.QNA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class SecondHigestSalary {

	public static void main(String[] args) {
		Map<String,Integer> emp = new HashMap<>();
		emp.put("tom", 1000);
		emp.put("bob", 1200);
		emp.put("lily", 1100);
		emp.put("Sam", 950);
		
		Entry<String, Integer> result = emp.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toList()).get(1);
		
		Entry<String, Integer>  secValue = emp.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()).get(1);
//		System.out.println(result);
		System.out.println(secValue);

	}

}
