package com.Hierarchical;

public class D extends A{

	void m4() {
		System.out.println("Class-D--> m4() method");
	}
	
	public static void main(String[] args) {
		  
		  B b=new B();
		  C c=new C();
		  D d=new D();
		  
		 
		  b.m1();
		  b.m2();
		  c.m3();
		  d.m4();
		 
	}
	
}
