package com;

public class CalculatorImp implements Calculator {
//we have to follow the contract of abstract.1.override the abstract method or change the class as abstract
	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		
		return x-y;
	}

	@Override
	public int mul(int x, int y) {
		return x*y;
	}

	@Override
	public int div(int x, int y) {//To Avoid Arithmetic Exceptions
		if(x!=0 && y!=0) {
		return x/y;
	}
		return 0;
	}

	@Override
	public String displayErrorMessage() {
		return "Invalid Choice";
	}

}
