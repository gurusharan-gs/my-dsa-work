package com.alphabet;

public class A_alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n = 7;
		
		for(int i=0; i<7; i++) {
			
			for(int j=7; j>i; j--) {
				System.out.print(" ");
			}
			
			for(int k=0; k<=i; k++) {
				if(k==i || k==0 || i==4) {
					System.out.print(" "+"*");
				}else {
					System.out.print(" "+" ");
				}
			}
			
			System.out.println();
		}
		

	}

}
