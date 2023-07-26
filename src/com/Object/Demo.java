package com.Object;

public class Demo {
	
	
	public static void main(String[] args) {
		
		int a=20;
		
		Integer i= new Integer(a);
		System.out.println("i >>"+i); //AutoBoxing
        
		int b=i.intValue();
		System.out.println("b >>"+b);  //unboxing

		
		Integer j=Integer.valueOf("10");
		Double d=Double.valueOf("110.222");
		Boolean b1=Boolean.valueOf("vaibhav");
		Character c=Character.valueOf('p');
		Float f=Float.valueOf("10.4f");
		Long l=Long.valueOf("100000");
		Byte b2=Byte.valueOf("11");
		Short s1=Short.valueOf("2");
		
		System.out.println(j);
		System.out.println(d);
        System.out.println(b1);
        System.out.println(c);
        System.out.println(f);
		System.out.println(l);
		System.out.println(b2);
		System.out.println(s1);
		
		

		
		
	}

}
