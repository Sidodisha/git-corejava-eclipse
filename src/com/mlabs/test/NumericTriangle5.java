package com.mlabs.test;

public class NumericTriangle5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int odd = 1;
		int size = 5;
		int space = size - 1;
		for (int j = 1; j <= size; j++) {
			for (int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			int k = 0;
			for (int i = 1; i <= odd; i++) {
				if (j < i) {
					k = k - 1;
				} else {
					k = k + 1;
				}
				System.out.print(k);
			}
			System.out.println("");
			odd = odd + 2;
			space = space - 1;
		}
	}

}
