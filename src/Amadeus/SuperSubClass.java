package Amadeus;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}
 
class Child extends Parent {
    Child() {
        System.out.println("Child class constructor");
    }
}
 

public class SuperSubClass {
	public static void main(String[] args) {
		Child obj = new Child();
		
	
	
	Map<String, Integer> hashMap = new HashMap<>();
	
	  hashMap.put("one", 1);
	  hashMap.put("two", 2);
	  hashMap.put("three", 3);
	  Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
	  hashMap.put("four", 4);

	   while (iterator.hasNext()) 
	   {	
	        Map.Entry<String, Integer> entry = iterator.next();
	        System.out.println(entry.getKey() + " : " + entry.getValue());
	   }

}
}
