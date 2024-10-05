package com.java8.lambdaExpresion;

interface Calculator {
//	void switchOn();
//	void sum(int input);
	int sub(int i1, int i2);
}

public class CalculatorImpl {

	public static void main(String[] args) {
//		() -> {body}
//		Calculator cal = () -> System.out.println("switchOn");
//		cal.switchOn();
		
//		
//		Calculator cal = (input) -> System.out.println("Sum : "+input);
//		cal.sum(234);
//		
		Calculator cal = (i1,i2) ->{
			if(i1 > i2) {
				throw new RuntimeException("Exception Occures");
			}else {
				return i2 - i1;
			}
		};
		System.out.println(cal.sub(8,20));
}

}
