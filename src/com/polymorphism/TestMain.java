package com.polymorphism;

public class TestMain {
	 
	public void methodOne(int i) {
		System.out.println("this is a Integer type argument");
	}
	public void methodOne(float j) {
		System.out.println("this is  a foat type argument");
	}
	
	public static void main(String[] args) {
		
		TestMain tm=new TestMain();
		tm.methodOne(10);
		tm.methodOne(10.5f);
		//.methodOne(10.43); method argument is not applicable for float Data type
	}
	
	

}
