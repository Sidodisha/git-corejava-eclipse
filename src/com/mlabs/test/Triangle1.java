package com.mlabs.test;

public class Triangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *
		 **
		 ***
		 ****
		 *****
		 */
		
		System.out.println("This is a Triangle..");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			System.out.println(" ");
		}
		
		/*
		 *****
		 ****
		 ***
		 **
		 *
		 */
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			System.out.println("");
		}
	}

}
