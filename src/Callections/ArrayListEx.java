package Callections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		 
        // Populating the ArrayList by custom elements
        al.add("Anshul Aggarwal");
        al.add("Mayank Solanki");
        al.add("Abhishek Kelenia");
        al.add("Vivek Gupta");
		
		ArrayList<Integer> arrList1 = new ArrayList<>();
//		Add an Element in an ArrayList
		arrList1.add(10);
		arrList1.add(12);
		arrList1.add(13);
		arrList1.add(13);
		arrList1.add(30);
		arrList1.add(40);
		arrList1.add(43);		
//		Remove an Element in an ArrayList
//		arrList1.remove(2);
//		arrList1.remove(0);
//		Update an Element in an ArrayList
//		arrList1.add(0, 50);
//		Remove duplicates from an ArrayList
//		for(int i=0;i<arrList1.size()-1;i++)
//		{
//			if(arrList1.get(i) != arrList1.get(i+1))
//			System.out.println(arrList1.get(i));
//		}
//		Reverse an ArrayList
//		for(int i=arrList1.size()-1; i>0; --i)
//		{
//			System.out.println(arrList1.get(i));
//		}
//		Converting ArrayList to String
		
		String[] k = al.toArray(new String[al.size()-1]);
		for(String s : k) {
			System.out.println(s);
		}
		
//		Getting a sub-list from an ArrayList
		List<Integer> s = arrList1.subList(2, 7);
		
		
		System.out.println(s);
		
	}

}
