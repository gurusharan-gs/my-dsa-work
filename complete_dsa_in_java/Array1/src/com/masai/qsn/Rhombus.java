package com.masai.qsn;

public class Rhombus {

	public static void main(String[] args) {
		int size = 7; // size of the rhombus
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = size - 1; i >= 1; i--) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
