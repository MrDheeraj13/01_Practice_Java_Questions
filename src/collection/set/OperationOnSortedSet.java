package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OperationOnSortedSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
//		Adding elements
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		
//		Iterating through Set
		for(String s :set) {
			System.out.print(s+",");
		}
		System.out.println();
		
//		Accessing elements
		System.out.println("It contains D : "+set.contains("D"));
		
//		Removing elements
		System.out.println("Remove F : "+set.remove("F"));
		
//		Iterating elements
		Iterator value = set.iterator();
		while(value.hasNext()) {
			System.out.println(value.next());
		}
		
		
		
		
	}

}
