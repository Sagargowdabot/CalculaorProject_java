package com;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("enter choice");
			int choice=scanner.nextInt();
			switch (choice) {
			case 1: 
				
				System.out.println("hi tom");
				break;
			case 2:
				System.out.println("Hi Jerry");
				break;
			case 3:
				System.out.println("Thsnk You");
				System.exit(0);//Terminate the JVM (Program)
			
			default:
				System.out.println("Bye");
			}
		}

	}

}
