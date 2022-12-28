package com.masai;

public class RotateBy90 {

	public static void printMatrix(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.err.print(matrix[i][j] + " ");
			}
			System.err.println();
		}
	}

	public static void transposertInPlace(int[][] matrix, int r, int c) {

		for (int i = 0; i < c; i++) {
			for (int j = i; j < r; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	public static void reverceArray(int[] arr) {
		
		int i = 0, j = arr.length-1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void rotate(int[][] matrix, int n) {
		transposertInPlace(matrix, n, n);

		for (int i = 0; i < n; i++) {
			reverceArray(matrix[i]);
		}
	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		int n = matrix.length;

		printMatrix(matrix);
		System.out.println("--------------");
		rotate(matrix, n);
		System.out.println("--------------");
		printMatrix(matrix);
	}

}
