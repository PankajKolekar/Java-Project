package com.Inheritance;

// Single Inheritance

public class SavingBank extends Bank {
	
	public void getSavingBankDeatils() {
		System.out.println("this is Saving Bank Account Deatils ");
	}
  
	public static void main(String[] args) {
		
		SavingBank sb=new SavingBank();
		sb.getSavingBankDeatils();
		sb.getBankDeatils();
	}
	
	
}
