package collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<Integer>();
		setA.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
	
		
		Set<Integer> setB = new HashSet<Integer>();
		setB.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
		
		// To find union
		Set<Integer> union = new HashSet<>(setA);
		union.addAll(setB);
		System.out.println("Union of two set: "+union);
		
		// To find intersection
		Set<Integer> intersaction = new HashSet<>(setA);
		intersaction.retainAll(setB);
		System.out.println("intersaction of both set : "+intersaction);
		
		// To find the symmetric difference
		Set<Integer> diff = new HashSet<>(setA);
		diff.removeAll(setB);
		System.out.println("Difference b/w both set : "+diff);

	}

}
