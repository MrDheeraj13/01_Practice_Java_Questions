package Coding_round;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharecter {

	public static void main(String[] args) {
		String str = "DheerajKumar";
		int arr[] = {1,2,3,4,2,1};
 		Map<String,Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map);
		List<String> duplicate = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(x->x.getValue() >1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		
//		System.out.println(duplicate);
		
		List<String> Num = Arrays.stream(a->a)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(x->x.getValue() >1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}

}
