package com.demo;

public class Default_Con {
	
	   String city;
	   
	   public Default_Con() {
		   city="Pune";
		  
	   }
	
	
	public static void main(String[] args) {
		
		Default_Con dc=new Default_Con();
		System.out.println("The Name Of city -->>"+dc.city);
		System.out.println(dc.city);

	}

}
