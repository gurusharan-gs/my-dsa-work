package com.recursion;

public class Pow {

	static int pow(int p, int q) {
		if (q == 0)
			return 1;
		return p * pow(p, q - 1);
	}

	public static void main(String[] args) {
		System.out.println(pow(2, 3));
	}

}

// tc O(q)
// sc O(q)
