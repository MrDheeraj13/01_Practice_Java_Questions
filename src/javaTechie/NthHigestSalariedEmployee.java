package javaTechie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class NthHigestSalariedEmployee {
	
	public static Map.Entry<String, Integer> getNthHigestSalary(int num, Map<String,Integer> map){
		return  map.entrySet()
				.stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toList()).get(num-1);
		
	}
	
	public static Entry<Integer, List<String>> getGenericNthHighestSalary(int num, Map<String,Integer> map){
		return map.entrySet().stream()
				.collect(Collectors.groupingBy(Map.Entry::getValue,
						Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
				.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.collect(Collectors.toList()).get(num-1);
	}

	public static void main(String[] args) {
		Map<String,Integer> Employee = new HashMap<>();
		Employee.put("tom", 1200);
		Employee.put("bob", 1000);
		Employee.put("lily", 1800);
		Employee.put("sam", 1700);
		Employee.put("peter", 1400);
		Employee.put("Alice", 2100);
		
		Entry<String, Integer> secondHigestSalary = getNthHigestSalary(2,Employee);

//		System.out.println(secondHigestSalary);
		
		Map<String,Integer> Employee2 = new HashMap<>();
		Employee2.put("tom", 1200);
		Employee2.put("bob", 1200);
		Employee2.put("lily", 1800);
		Employee2.put("sam", 1800);
		Employee2.put("peter", 1400);
		Employee2.put("Alice", 2000);
		Employee2.put("Paul", 2000);
		
		System.out.println(getGenericNthHighestSalary(2,Employee2));
//		System.out.println(getNthHigestSalary(2, Employee2));
		
//		3.Rotate List with specifice range
		List<Integer> ls = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			ls.add(i);
		}
		System.out.println("Normal list : "+ls);
//		Collections.rotate(ls, ls.size());
		Collections.rotate(ls, 4);
//		Collections.rotate(ls, -4);
//		Collections.rotate(ls, 15);
		System.out.println("Rotated List : "+ls);
		
		
	}
	
	

}
