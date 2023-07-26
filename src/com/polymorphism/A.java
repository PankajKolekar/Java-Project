package com.polymorphism;

public class A {

	private void Test(Object object) {
		System.out.println("test-Object ");
	}
	private void Test(String str) {
		System.out.println("test-String");
	}
	public static void main(String[] args) {
		A a=new A();
		a.Test(new Object());
		a.Test("Pk");
		a.Test(new A());
		a.Test(new String());
		
		
	}
	
}
