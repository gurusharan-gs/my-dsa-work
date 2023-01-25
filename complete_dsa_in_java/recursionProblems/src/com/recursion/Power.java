package com.recursion;

public class Power {

	static int pow(int p, int q) {
		if (q == 0)
			return 1;

		int smallPow = pow(p, q / 2);
		if (q % 2 == 0) {
			return smallPow * smallPow;
		}
		return p * smallPow * smallPow;
	}

	public static void main(String[] args) {
		System.out.println(pow(5, 4));
	}
}
