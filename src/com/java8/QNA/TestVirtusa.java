package com.java8.QNA;

public class TestVirtusa {
	public String m1(){
		try{
			int n = 10/0;
		System.out.println("In try");
		return "return try";
		}catch(Exception e){
		System.out.println("in catch");
		return "Exception";
		}finally{
		System.out.println("in finally");
		return "return finally";
		}
		}


	public static void main(String[] args) {
		TestVirtusa t1 = new TestVirtusa(); 
		t1.m1();
	}

}
