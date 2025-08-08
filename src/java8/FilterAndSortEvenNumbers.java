package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSortEvenNumbers {
	
	
	/*Using Streams, write a method that takes a list of integers and 
	 * returns a new list with only the even numbers, sorted in descending order.
	 */
	public List<Integer> sortedListEvenNumber(List<Integer> ls) {
		
		return ls.stream().filter(n -> n%2 == 0)
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(23,45,67,98,76,54,56,78,90,87);
		
		
		FilterAndSortEvenNumbers list = new FilterAndSortEvenNumbers();
		
		list.sortedListEvenNumber(ls);

	}

}
