package com.java8.map_flatmap;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatmap {
	public static void main(String[] args) {
		List<Customer> customers = EkartDataBase.getAll();
		
//		List<customer> convert List<String> --> Data transformation
		List<String> collect = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(collect);
		
		List<List<String>> collect2 = customers.stream().map(n -> n.getPhoneNumber()).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<String> collect3 = customers.stream().flatMap(n -> n.getPhoneNumber().stream()).collect(Collectors.toList());
		System.out.println(collect3);
	}

}
