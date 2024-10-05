package Callections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
//		Set<String> st = new HashSet<>();
		HashSet<String> st = new HashSet<>();
		st.add("DDD");
		st.add("DDD");
		st.add("DDD");
		st.add("DDD");
		st.add("DDD");
		st.add("DHD");
		st.add("DHD");
		st.add("DHD");
		st.add("DHK");
		st.add("DHK");
		
//		System.out.println(st);	
		
//		List<Integer> ls = new ArrayList<>();
		
			Integer[] A = {22, 45,33, 66, 55, 34, 77};  
	        Integer[] B = {33, 2, 83, 45, 3, 12, 55};  
	        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(A));
	        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(B));
	        // Finding Union of set1 and set2   
	        Set<Integer> union_data = new HashSet<Integer>(set1); 
	        union_data.addAll(set2);
	        System.out.println("All union of both sets :"+union_data);
	        
	        // Finding Intersection of set1 and set2   
	        Set<Integer> intersection = new HashSet<Integer>(set1);
	        intersection.retainAll(set2);
	        System.out.println("Intersection of both sets :"+intersection);
	        
	        // Finding Difference of set1 and set2   
	        Set<Integer> diff = new HashSet<Integer>(set1);
	        diff.removeAll(set2);
	        System.out.println("Diffrence of both sets :"+diff);
	        
//	        List<String> myList = Arrays.asList("apple", "orange", "banana");
//
//	        System.out.println(myList.stream().sorted().findAny().get());
//	        
	        
	}

}
