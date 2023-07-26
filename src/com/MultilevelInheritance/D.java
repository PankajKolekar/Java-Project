package com.MultilevelInheritance;

public class D extends C {
	
	void m4() {
		System.out.println("this is m4() method ");
	}
 
	public static void main(String[] args) {
		
		   D d=new D();
		  
		   d.m1();
		   d.m2();
		   d.m3();
		   d.m4();
		   
	}
	
	
}
