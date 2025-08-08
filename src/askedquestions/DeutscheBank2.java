package askedquestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DeutscheBank2 {
    public static void main(String[] args) {
    	
    	String str = "This is the best way to practice for way iterview with coding practice";
    	
    	Map<String, Long> count = Arrays.stream(str.split(" "))
    			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    	System.out.println(count);
    }
}
