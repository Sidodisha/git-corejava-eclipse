package com.mlabs.test;

public class NumericTriangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1
		 12
		 123
		 1234
		 12345
		 */
		for(int j = 1;j<=5;j++){
			for(int i = 1;i<=5;i++){
				if(i<=j){
				System.out.print(i);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
