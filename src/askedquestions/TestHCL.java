package askedquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestHCL {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,6,5);
		Set<Integer> set = new HashSet<>();
		List<Integer> collect = ls.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
		System.out.println(collect);
		ls.add(8);
		ls.add(9);
		for (Integer integer : ls) {
			System.out.println(ls);
		}
		

		
	}

}
 