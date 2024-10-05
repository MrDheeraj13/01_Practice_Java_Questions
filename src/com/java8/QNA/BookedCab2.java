package com.java8.QNA;

interface Cab2{
	public String reserveCab(String source,String destination);
}

//class Ola2 implements Cab2{
//
//	@Override
//	public String reserveCab(String source, String destination) {
//		System.out.println("Source: "+source+" Destination: "+destination);
//		return ("Price :500");
//	}
//	
//}

public class BookedCab2 {

	public static void main(String[] args) {
		Cab2 cab2 = (source,destination)->{System.out.println("your cab is booked from: "+source+" to: "+destination);
		return ("Price: 500");
		};
		System.out.println(cab2.reserveCab("PNQ", "VNS"));

	}

}
