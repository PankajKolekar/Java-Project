package com.Encapulation;

public class Enc1 {
	
	private int rollNo;
	
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int No) {
		if(No>0) {
			rollNo=No;
			System.out.println(rollNo);
		}else 
		{  rollNo=0;
		    System.out.println("Roll No Can not be -ve or zero");
		}
		
	}

	
	public static void main(String[] args) {
		
		Enc1 en1=new Enc1();
		   en1.setRollNo(0);
		
	}

}


/*
 * Every data member should be declared as private and for every member we have to maintain public getter & Setter methods.
 * 
 */
