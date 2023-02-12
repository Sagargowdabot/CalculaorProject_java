package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanr= new Scanner(System.in);
		Calculator calculator = new CalculatorImp();
		while(true) {//we while to infinite looping
		System.out.println("1:Addition\n2:Substraction\n3:Multiplication");
		System.out.println("4:Divison\n5:Exit\nEnter Choice:");
		int choice =scanr.nextInt();
		int a=0;
		int b=0;//we have to initialize local variable explicitly because local variable does'nt have default values
		if(choice>=1 && choice<=4) {
			System.out.println("Enter 2 numbers");
			a=scanr.nextInt();
			b=scanr.nextInt();
		}
		switch(choice) {
		case 1:
			System.out.println("sum of "+a+"&"+b+"is"+calculator.add(a, b));
			break;
		case 2:
			System.out.println("Diffrence of "+a+"&"+b+"is"+calculator.sub(a, b));
			break;
			
		case 3:
			System.out.println("Product of "+a+"&"+b+"is"+calculator.mul(a, b));
			break;
		case 4:
			int result=calculator.div(a, b);
			if(result!=0) {
			System.out.println("Divison of "+a+"&"+b+"is"+result);
			}
			else {
				System.out.println("Cannot Perform Division");
			}
			break;
		case 5:
			System.out.println("Thank You");
			System.exit(0);
		default:
			System.out.println(calculator.displayErrorMessage());
		
			
		
		
		
	
		}
		scanr.close();
	}

}
}
