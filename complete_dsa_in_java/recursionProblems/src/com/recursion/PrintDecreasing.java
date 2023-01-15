package com.recursion;

public class PrintDecreasing {

	static void printDecreasing(int n) {
		// base condition
		if (n == 1) { // 5 4 3 2 1
			System.out.println(1);
			return;
		}

		System.out.print(n); // itself calll 5
		printDecreasing(n - 1); // smallest subproblem 4 3 2 1

	}

	public static void main(String[] args) {
		int n = 5;
		printDecreasing(n);

	}

}
