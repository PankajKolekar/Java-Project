package com.demo;


// A Constructor with arguments is Called as Parameterized Constructor;

public class Para_Con {
	
	int p;
	String str;
	String str1;
	
	public Para_Con(int rollNo,String name,String city ) {
		
		p=rollNo;
		str=name;
		str1=city;
		
   }
	// @Override
	
	 public Para_Con(int rollNo,String name) {
		 p=rollNo;
		 str=name;
		 
	 }
  
	 
	
	@Override
	public String toString() {
		return "Para_Con [p=" + p + ", str=" + str + ", str1=" + str1 + "]";
	}

	public static void main(String[] args) {
		
		Para_Con pc=new Para_Con(10,"Pankaj","Pune");
		Para_Con pc1=new Para_Con(10,"Pankaj");
		
		System.out.println(pc);
		System.out.println(pc1);
		
		//System.out.println("Info of the Student is -->> "+"Roll no: "+pc.p+"\t Name of Student: "+pc.str+"\t City of Student: "+pc.str1);
		//System.out.println("Info of the Student is -->> "+"Roll no: "+pc1.p+"\t Name of Student: "+pc1.str);
		
	}

}

/*
 * •	main purpose constructor is to initialization of global variables at the time of at object creation.
   •	Constructor cannot be overridden because we can’t write multiple constructors with same arguments. If you are tried to write it then you will get compiler time error.
   •	When you don’t write any constructor in the class then default constructor will be added by JVM automatically at the compile time.
   •	When you write any constructor in the class then default constructor will not added by JVM.
   •	Constructor does not have any return type. If you write any return type then it will be called as method.

 */

