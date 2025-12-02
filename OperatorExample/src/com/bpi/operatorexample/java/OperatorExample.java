package com.bpi.operatorexample.java;

import java.util.Scanner;

public class OperatorExample {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
	  			System.out.println("Enter first integer: ");
				int num1 = input.nextInt();
				System.out.println("Enter second integer: ");
				int num2 = input.nextInt();
				int sum = num1 + num2;
				int difference = num1 - num2;
				int product = num1 * num2;
			
				System.out.println("Sum " + sum);
				System.out.println("Difference " + difference);
				System.out.println("Product " + product);

		}
	}
