package com.polymorphism;

public class Employee {
	
     public void addEmployes(String name,String city,String type)
     {
    	System.out.println("this is employee Data");
     }
      void addEmployes(String name,String city)
      {
     	 System.out.println("this is Employee name and City");
      }
     
     public static void main(String[] args) {
		
    	 Employee emp=new Employee();
    	 
       emp.addEmployes("Vaibhav", "Pune", "Permanent");
    	emp.addEmployes("PK", "Solapur");
    	//System.out.println(emp.addEmployes("PK", "jsa");
    	//System.out.println(emp);
	}

}
