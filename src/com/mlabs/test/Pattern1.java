package com.mlabs.test;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First Way find (Run Pattern2 for second way) 
		
		/*
		***** 
		*   * 
		*   * 
		*   * 
		*****
		*/  
		System.out.println("This is added");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println(" ");

		for (int j = 1; j < 4; j++) {
			for (int i = 1; i <= 5; i++) {
				if (i == 1 || i == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}

}
