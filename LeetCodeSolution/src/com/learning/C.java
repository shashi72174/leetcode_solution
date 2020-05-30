package com.learning;

public interface C extends B,A {
	public void printC();
	
	
	public default void defaultMeth() {
		System.out.println("this is defaultMeth from interface C");
	}
	
	public static void staticMeth() {
		System.out.println("this is static method from itnerface C");
	}
}
