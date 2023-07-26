package com.Abstraction;

public class Test2 implements Test1{

	@Override
	public void t() {
		System.out.println("this is t() method");
		
	}
	public static void main(String[] args) {
		Test2 t2=new Test2();
		t2.t();
	}

}
