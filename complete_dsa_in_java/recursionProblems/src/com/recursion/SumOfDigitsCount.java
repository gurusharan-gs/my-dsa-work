package com.recursion;

public class SumOfDigitsCount {
	
	static int sumOfDigitsCount(int n) {
		if(n >= 0 && n <= 9)return n;
		return sumOfDigitsCount(n/10) + 1;
		 
	}

	public static void main(String[] args) {

		System.out.println(sumOfDigitsCount(12345));
	}
}
