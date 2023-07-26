package com.polymorphism;

public class HDFC extends Axis{
	
	public void getSimpleInterset(float simpleInterest) {
		System.out.println("HDFC Bank rate of simple interset");
	}
	
	public static void main(String[] args) {
		
		HDFC hdfc=new HDFC();
		Axis axis=new Axis();
		axis.getSimpleInterest(12.5f);
		hdfc.getSimpleInterset(10.5f);
		
	}
	
}
