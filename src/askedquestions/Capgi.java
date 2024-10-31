package askedquestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Capgi {

	public static void main(String[] args) {
		String[] str = { "array", "puppet" };
//		o/p -- > y,u

		 Arrays.stream(str).forEach( s ->{
			 String uniquechar = s.chars()
					 .mapToObj(c -> (char) c)
					 .collect(Collectors.groupingBy(Function.identity(),
							 LinkedHashMap::new,Collectors.counting()))
					 .entrySet().stream()
					 .filter(e -> e.getValue() ==1)
					 .map(Map.Entry::getKey)
					 .map(String::valueOf)
					 .collect(Collectors.joining());
		System.out.println("Unique char in "+s+" : "+uniquechar);
		});
	}

}
