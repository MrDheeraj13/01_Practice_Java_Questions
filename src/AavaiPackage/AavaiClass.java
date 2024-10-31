package AavaiPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AavaiClass {

	public static void main(String[] args) {
		List<Integer> ls = new LinkedList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		System.out.println("After Adding values: "+ls);
		ls.remove(2);
		System.out.println("After removing values: "+ls);
		ls.set(3,44);
		System.out.println("Upadate list: "+ls);
		
		
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(11);
		l2.add(22);
		l2.add(33);
		l2.add(44);
		System.out.println(l2);
	}

}
