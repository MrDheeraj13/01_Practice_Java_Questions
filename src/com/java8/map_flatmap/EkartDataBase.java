package com.java8.map_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
	public static List<Customer> getAll(){
		return Stream.of(
				new Customer(1001,"Tom","tom@gmail.com",Arrays.asList("989765","987654")),
				new Customer(1001,"mom","mom@gmail.com",Arrays.asList("123342","787654")),
				new Customer(1001,"bob","bob@gmail.com",Arrays.asList("900000","817654")),
				new Customer(1001,"sam","sam@gmail.com",Arrays.asList("980000","821654"))
				
				).collect(Collectors.toList());
	}

}
