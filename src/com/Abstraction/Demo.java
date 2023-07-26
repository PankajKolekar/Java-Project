package com.Abstraction;

public interface Demo {
	
	public abstract void a1();  // allowed
	
	public void a2();          // allowed
	
	abstract void a3();       // allowed
	
	void a4();               // allowed
	
	//Note-->>: if we don’t write public or abstract in interface then JVM will insert it automatically.

}
