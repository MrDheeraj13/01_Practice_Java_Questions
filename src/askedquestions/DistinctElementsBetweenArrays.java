package askedquestions;

import java.util.HashSet;
import java.util.Set;

public class DistinctElementsBetweenArrays {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 3, 4, 5, 6, 7 };

		DistinctElementsBetweenArrays.printdistinctElement(array1, array2);

	}

	public static void printdistinctElement(int[] a, int[] b) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> distinctElements = new HashSet<>();

		for (int num : a) {
			set1.add(num);
		}

		for (int num : a) {
			set2.add(num);
		}

		for (int num : set1) {
			if (!set2.contains(num))
				distinctElements.add(num);
		}

		for (int num : set2) {
			if (!set1.contains(num))
				distinctElements.add(num);
		}

		System.out.println(distinctElements);

	}

}
