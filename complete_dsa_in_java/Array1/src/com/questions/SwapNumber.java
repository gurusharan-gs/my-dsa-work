package com.questions;

public class SwapNumber {
	
	static void swap(int a, int b) {
		
		System.out.println("Original values before swap");
		System.out.println("a "+a );
		System.out.println("b "+b );
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("values after swap");
		System.out.println("a "+a );
		System.out.println("b "+b );
		
	}
	
	static void swapWithoutTemp(int a, int b) {
		
		System.out.println("Original values before swap");
		System.out.println("a "+a );
		System.out.println("b "+b );
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("values after swap");
		System.out.println("a "+a );
		System.out.println("b "+b );
		
	}
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 8;	
//		swap(a, b);
		swapWithoutTemp(a, b);
		
	}

}
