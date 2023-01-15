package com.recursion;
import java.util.Scanner;

public class PrintIncreasing {

	 static void printIncreasing(int n) {
        
//		 base condition 
		 if(n == 1) { // 1 2 3 4 5
			 System.out.println(1);
			 return;
		 }
		 printIncreasing(n-1);
		 System.out.println(n);
		 
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n = sc.nextInt();
		printIncreasing(n);
		
	}
	
}
