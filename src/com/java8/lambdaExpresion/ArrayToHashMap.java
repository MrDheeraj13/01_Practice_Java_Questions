 package com.java8.lambdaExpresion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayToHashMap {
	
	private Integer key;
	private String value;
	
	public ArrayToHashMap(Integer id,String name) {
		this.key = id;
		this.value = name;
	}
	public Integer getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}

	public static void main(String[] args) {
		List<ArrayToHashMap> ls = new ArrayList<>();
		ls.add(new ArrayToHashMap(1,"I"));
		ls.add(new ArrayToHashMap(2,"am"));
		ls.add(new ArrayToHashMap(3,"the"));
		ls.add(new ArrayToHashMap(4,"best"));
		
		Map<Integer, String> map = new HashMap<>();
		ls.forEach(n -> map.put(n.getKey(), n.getValue()));
		System.out.println("List : "+ls);
		System.out.println("Map : "+map);

	}

}
