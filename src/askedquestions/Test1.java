package askedquestions;

import java.util.Arrays;
import java.util.List;

public class Test1 {

//	Write a java 8 code to remove the duplicate elements from the list
//	 
	public static void main(String[] args) {
	
	List<Integer> integerList = Arrays.asList(1,2,3,4,1,2,3);
	
	List distict =  integerList.stream().distinct().toList();
	System.out.println(distict);
	
//	integerList.stream().forEach(System.out::println);

	}

}
