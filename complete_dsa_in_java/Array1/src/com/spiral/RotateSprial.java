package com.spiral;

import java.util.Scanner;

public class RotateSprial {

	public static int[][] rotateSprial(int n) {

		int[][] matrix = new int[n][n];

		int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;

		int count = 1;

		while (count <= n * n) {

			// topRow -> leftCol to rightCol
			for (int j = leftCol; j <= rightCol && count <= n * n; j++) {
				matrix[topRow][j] = count++;
			}
			topRow++;
			// rightCool -> topRow to bottomRow
			for (int i = topRow; i <= bottomRow && count <= n * n; i++) {
				matrix[i][rightCol] = count++;
			}
			rightCol--;

			// bottomRow -> rightCol to leftRow
			for (int j = rightCol; j >= leftCol && count <= n * n; j--) {
				matrix[bottomRow][j] = count++;
			}
			bottomRow--;
			// leftRow -> bottomRow to topRow
			for (int i = bottomRow; i >= topRow && count <= n * n; i--) {
				matrix[i][leftCol] = count++;
			}
			leftCol++;
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the n");
		int n = sc.nextInt();

		int[][] matrix = rotateSprial(n);
		printMatrix(matrix);

	}
}
