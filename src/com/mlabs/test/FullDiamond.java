package com.mlabs.test;

public class FullDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		   * 
		  * *
		 * * *
		  * *
		   * 
		 */
		
		int size = 5;
		int odd = 1;
		int spaces = size/2;
		for (int j = 1; j <= size; j++) {
			for (int i = spaces; i >= 1; i--) {
				System.out.print(" ");
			}
			for (int i = 1; i <= odd; i++) {
				System.out.print("*");
			}
			System.out.println("");
			if (j < size/2+1) {
				odd = odd + 2;
				spaces = spaces - 1;
			} else {
				odd = odd - 2;
				spaces = spaces + 1;
			}
		}
	}

}
