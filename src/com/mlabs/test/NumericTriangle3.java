package com.mlabs.test;

public class NumericTriangle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1 
		 * 21 
		 * 321 
		 * 4321 
		 * 54321
		 */

		for (int j = 1; j <= 5; j++) {
			for (int i = j; i >= 1; i--) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

}
