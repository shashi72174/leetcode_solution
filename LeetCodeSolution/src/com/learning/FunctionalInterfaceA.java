package com.learning;

@FunctionalInterface  //this is functional interface, so dont add another abstract method here. it will throw an error.
public interface FunctionalInterfaceA {
	public String singleMeth();
	
	public static String singleStaticMeth() {
		return "fromSingleStaticMeth";//this will be returned from this static method
	}
}
