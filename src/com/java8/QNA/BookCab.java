package com.java8.QNA;

interface Cab{
	public void reserveCab();
}

//class Ola implements Cab{
//
//	@Override
//	public void reserveCab() {
//		System.out.println("Your cab is booked.");
//		
//	}
////	() - > System.out.println("Your cab is boked.");
//}

public class BookCab {

	public static void main(String[] args) {
	Cab cab = () -> System.out.println("Your cab is booked.");
	cab.reserveCab();

	}

}
