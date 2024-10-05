package askedquestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Capgi {

	public static void main(String[] args) {
		String[] str = { "array", "puppet" };
//		o/p -- > y,u

		List<Character> collect = Arrays.stream(str)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.flatMap(x ->x.getValue() == 1)
				.findFirst();
		

		System.out.println(collect);
	}

}
