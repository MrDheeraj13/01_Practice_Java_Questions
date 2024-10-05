package askedquestions;

import java.util.*;
import java.util.stream.Collectors;
public class TestToTheNew {

	public static void main(String[] args) {

		        List<String> cities = Arrays.asList("Delhi", "Mumbai", "Kolkata", "Mumbza", "Cochin");

//		        Map<Character, List<String>> cityMap = cities.stream()
//		            .collect(Collectors.groupingBy(city -> city.charAt(0), TreeMap::new, Collectors.toList()));
//
//		        cityMap.forEach((key, value) -> System.out.println(key + " -> " + value));
//		        
        Map<Character, List<String>> collectMap = cities.stream()
        		.collect(Collectors.groupingBy(c -> c.charAt(0),TreeMap::new,Collectors.toList() ));
        
        collectMap.forEach((key,value) -> System.out.println(key+ " -> "+value));
        
        
		        
		    }
		


	}


