package askedquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CommonQuestionAskedInJava8 {

	public static void main(String[] args) {
//		1. find last element

		List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
		
		String lst = listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();
		System.out.println(lst);
		
//		2.find 10 odd number
//		Stream.iterate(new int[] {1,3}, f -> new int[] {f[1],f[1]+2})
//		.limit(10)
//		.map(f -> f[0])
//		.forEach(System.out::println);
		
//		3.fibonacci series
		
//		Stream.iterate(new int[] {0,1}, f -> new int[] {f[1], f[0]+f[1]})
//		.limit(10).map(f -> f[0])
//		.forEach(System.out::println);
		
//		4.find duplicate data from list
		
//		List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
//		Set<Integer> set = new HashSet<>();
//		List<Integer> collect = listOfIntegers.stream().filter(n -> ! set.add(n)).collect(Collectors.toList());
//		System.out.println(collect);
		
//		5.most repeted element in array
		
		List<String> listStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
//		Map<String, Long> frequencyOfword = listStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		Entry<String, Long> mostFrequent = frequencyOfword.entrySet().stream().max(Map.Entry.comparingByValue()).get();
//		System.out.println(frequencyOfword);
//		System.out.println("Most repeted word : "+mostFrequent.getKey()+" "+mostFrequent.getValue());
//		
		Entry<String, Long> maxRepeted = listStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().max(Map.Entry.comparingByValue())
		.get();
		System.out.println(maxRepeted);
		
//		6.frequency of each charecter
//		String inputString = "Java Concept Of The Day";
//		Map<String, Long> collect = Arrays.stream(inputString.split(""))
//				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		
//		System.out.println(collect);
		
//		7.short decimal value in reverse order
//		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
//		decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
//		8.Divide the list by 5
//		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//		listOfIntegers.stream().filter(n -> n%5 == 0).forEach(System.out::println);
//		Integer max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
//		System.out.println(max);
		
//		9.merge two unsorted arrays into single sorted array 
		
//		int[] a = new int[] {4, 2, 3,5,7, 1};
//        int[] b = new int[] {8, 3, 9, 1,3,5};
//        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
//        System.out.println(Arrays.toString(c));
        
//      10. find 3max and 3 min number from list
        
//        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//        List<Integer> min3 = listOfIntegers.stream().sorted().collect(Collectors.toList());
//		System.out.println("Min thre value from list : "+min3);
//		
//		List<Integer> max3 = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
//		System.out.println("Max 3 :"+max3);

//		11.check two string are anagram or not
		
		String s1 = "RaceCar";
		String s2 = "CarRacer";
		String s3 = "carrace";
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		if (s1.equals(s2)) {
			System.out.println("Strings are Anagram");
		} else {
			System.out.println("Not an anagram");
		}
		
		
//      12. Second largest number in list
        
        List<Integer> listOfInteger = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int secondLargest = listOfInteger.stream().sorted(Comparator.reverseOrder())
        		.skip(1).findFirst().get();
		System.out.println(secondLargest);

//		merger two array
		int[] a = new int[] { 4, 2, 3, 5, 7, 1 };
		int[] b = new int[] { 8, 3, 9, 1, 3, 5 };
		int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).distinct().sorted().toArray();
		System.out.println(Arrays.toString(c));
		
		
	}

}
