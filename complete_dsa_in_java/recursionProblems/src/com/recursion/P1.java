package com.recursion;

public class P1 {
	
	static void p1(int n) { // 4 3 2 1  =  1 2 3 4 5
		if(n == 1) {
			System.out.println(1);
			return;
		}
		p1(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		int n = 5;
		p1(n);
	}

}
