package com.Abstraction;

public class TestMain extends Example{

	@Override
	void m3() {
        System.out.println("this is m2 method");		
	}
	
	
   public static void main(String[] args) {
	
	   TestMain tm=new TestMain();
	   //Example em=new Example();
	   
	   tm.m1();
	   tm.m2();
	   tm.m3();
	   
}
   
	
	
	
}
