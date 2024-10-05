package com.java8.QNA;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class QuestionOnStringUsingJava8 {

	public static void main(String[] args) {
		String str = "this the best way to learn java8";
		Set<Integer> set = new HashSet<>();
		
		OptionalInt firstchar = str.chars().filter(n->!set.add(n)).findFirst();
		if(firstchar.isPresent())
		{
			System.out.println((char) firstchar.getAsInt());
		}
		
		Map<String, Long> lst = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(lst);
	}

}
