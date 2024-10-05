package Callections;

import java.util.*;
public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(101, "Dheeraj");
		hmap.put(102, "Kumar");
		hmap.put(103, "Test");
		hmap.put(null, null);
		
//		System.out.println(hmap);
		System.out.println(hmap.get(103));
		System.out.println(hmap.keySet());

	}

	

}
