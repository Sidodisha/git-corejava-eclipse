package com.mlabs.test;

public class NumericTriangle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *     1 
		 *    2 2 
		 *   3 3 3 
		 *  4 4 4 4
		 * 5 5 5 5 5
		 */
		int size = 4;
		int space = size-1;
		for (int j = 1; j <= size; j++) {
			for (int i = space; i >= 1; i--) {
				System.out.print(" ");
			}
			for (int i = 1; i <= j; i++) {
				System.out.print(j + " ");
			}
			System.out.println("");
			space = space - 1;
		}

	}

}
