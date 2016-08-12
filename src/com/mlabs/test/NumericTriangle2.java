package com.mlabs.test;

public class NumericTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1
		 22
		 333
		 4444
		 55555
		 */
		for(int j = 1;j<=5;j++){
			for(int i = 1;i<=5;i++){
				if(i<=j){
				System.out.print(j);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
