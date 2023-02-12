package com;

public interface Calculator {
	int add(int x, int y);//abstract method with return type
	int sub(int x,int y);
	int mul(int x,int y);
	int div(int x,int y);
	String displayErrorMessage();//error message for invalid entry
	

}
//all the above methods are automatically abstract methods
