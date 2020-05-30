package com.learning;

public class CImpl implements C {

	@Override
	public void printA() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printB() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printC() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void defaultMeth() {
		C.super.defaultMeth();
		System.out.println("this is defaultMeth from class CImpl");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C.staticMeth();
		FunctionalInterfaceA functionalInterfaceA = () -> "this is functionalinterfaceA implementation";
		System.out.println(functionalInterfaceA.singleMeth());
	}

	

}
