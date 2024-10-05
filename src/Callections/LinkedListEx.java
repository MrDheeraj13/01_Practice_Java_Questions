package Callections;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
//		Access Elements of a LinkedList 
		lList.add("D");
		lList.add("H");
		lList.add("E");
		lList.add("E");
		lList.add("R");
		lList.add("A");
		lList.add("J");
		
//		Add Elements to a LinkedList 
//		lList.add("Kumar");
//		Check if the LinkedList contains the Element 
//		System.out.println(lList.isEmpty());
//		Change Elements of a LinkedList
//		System.out.println("Changing values : "+lList.set(7,"K.."));
//		Remove All Elements from a LinkedList 
//		System.out.println("Removing all elements : "+lList.removeAll(lList));
//		Iterate over LinkedList using Iterator
//		for(int i = 0 ; i < lList.size()-1;i++) {
//			System.out.println(lList.get(i));
//		}
		
//		for(String str:lList) {
//			System.out.print(str+" ");
//		}
//		To Array();
//		Object a[] = lList.toArray();
//		for(Object e:a)
//		System.out.print(e+" ");
//		 Size();
		System.out.println(lList.size());
//		remove First();
		System.out.println(lList.removeFirst());
//		remove last();
		System.out.println(lList.removeLast());
		
		
		System.out.println(lList);

	}

}
