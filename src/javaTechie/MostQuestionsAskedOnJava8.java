package javaTechie;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MostQuestionsAskedOnJava8 {

	public static void main(String[] args) {
		String str = "i am the best java developer in the world";
//		1.Find character occurrence
		Map<String, Long> map = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map);
		
		
//		2.Find the duplicate character
		
		Set<String> set = new HashSet<>();
		List<String> duplicatelist = Arrays.stream(str.split(""))
				.filter(ch ->!set.add(ch)).collect(Collectors.toList());
//		System.out.println(duplicatelist);
//		List<String> duplicateChar = map.entrySet().stream().filter(x ->x.getValue() > 1)
//		.map(Map.Entry::getKey).collect(Collectors.toList());
//		System.out.println(duplicateChar);
		
		
//		3.find unique character
		List<String> uniquesChar = map.entrySet().stream().filter(ch -> ch.getValue() == 1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
//		System.out.println(uniquesChar);
		
//		4.Find first unique character in the given string.
		
		String FirstChar = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream()
		.filter(x -> x.getValue() == 1)
//		.map(Map.Entry::getKey)
		.findFirst().get().getKey();
//		System.out.println(FirstChar);
		
		
//	5.Second highest number from list
		
		List<Integer> ls = Arrays.asList(76,53,12,45,67,51,65,45);
		Integer SecondHighest = ls.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//		System.out.println(SecondHighest);
		
//		6.Find the longest String from given array.
		List<String> strList = Arrays.asList("Java","Java 8","Spring Boot","Microservices","RestAPi","JPA");
		
		String LargestString = strList.stream()
				.reduce((word1,word2) -> word1.length() > word2.length() ? word1:word2 )
		.get();
		
//		System.out.println(LargestString);
		
//		7.Find the List starts with 1
		
		List<String> listStatsWith = ls.stream()
		.map(s->s+"")
		.filter(s -> s.startsWith("1"))
		.collect(Collectors.toList());		
//		System.out.println(listStatsWith);
		

		List<String> StartsWith = strList.stream().filter(c -> c.startsWith("J")).collect(Collectors.toList());
		System.out.println(StartsWith);
		
	}
	
	
}
