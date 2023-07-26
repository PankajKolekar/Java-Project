package com.Abstraction;

public class S implements P,Q{

	@Override
	public void q() {
		System.out.println("This is q() method");
		
	}

	@Override
	public void p() {
    
		System.out.println("This is p() method ");
	}
	public static void main(String[] args) {
		
		S s=new S();
		s.p();
		s.q();
	}

}
