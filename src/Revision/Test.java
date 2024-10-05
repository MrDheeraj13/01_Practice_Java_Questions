package Revision;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("apple", "orange", "banana");
		
		System.out.println(myList.stream().sorted().toList());
	}

}
