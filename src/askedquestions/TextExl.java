package askedquestions;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TextExl {

	public static void main(String[] args) {
//		String name = "This is test message";
//		
//		Map<String, Long> collect = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(collect);
		
		List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> collect = listOfIntegers.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
		System.out.println(collect);
		
				


	}

}
