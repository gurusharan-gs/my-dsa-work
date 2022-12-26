package com.spiral;

public class SprialRotata {

	public static void sprialRotata(int[][] matrix, int r, int c) {

		int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
		int totalCount = 0;
		while (totalCount < r * c) {

			// topRow -> leftCol to rightCol
			for (int j = leftCol; j <= rightCol && totalCount < r * c; j++) {
				System.out.print(matrix[topRow][j] + " ");
				totalCount++;
			}
			topRow++;
			// rightCool -> topRow to bottomRow
			for (int i = topRow; i <= bottomRow && totalCount < r * c; i++) {
				System.out.print(matrix[i][rightCol] + " ");
				totalCount++;
			}
			rightCol--;

			// bottomRow -> rightCol to leftRow
			for (int j = rightCol; j >= leftCol && totalCount < r * c; j--) {
				System.out.print(matrix[bottomRow][j] + " ");
				totalCount++;
			}
			bottomRow--;
			// leftRow -> bottomRow to topRow
			for (int i = bottomRow; i >= topRow && totalCount < r * c; i--) {
				System.out.print(matrix[i][leftCol] + " ");
				totalCount++;
			}
			leftCol++;
		}
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
		
		int[][] matrix = {
				
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int r = 4;
		int c = 4;
		
	   sprialRotata(matrix, r, c);
		
	}

}
