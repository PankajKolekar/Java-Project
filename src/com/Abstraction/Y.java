package com.Abstraction;

public class Y extends X implements W{
	
	public void y() {
		System.out.println("this is y() method ");
	}
	
	public static void main(String[] args) {
		
		Y y1=new Y();
		y1.w();
		y1.y();
		y1.x();
		
	}

@Override
public void w() {
	
	System.out.println("this is w() method :");
	
}

}
