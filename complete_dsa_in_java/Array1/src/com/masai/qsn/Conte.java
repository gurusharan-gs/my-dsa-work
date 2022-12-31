package com.masai.qsn;

import java.util.Scanner;

public class Conte {
	
	   public static void contractor(int[] arr1,int[] arr2, int n){
	           	int res =arr1[0];
	           	
	    		for(int j=0; j<n; j++){
	    		    
	    		    res = Math.max(res,arr1[j]);
	    		    System.out.print(arr2[j] - res+" ");
	    		    res = Math.max(res, arr2[j]); 
	    		}
	    		System.out.println();
	   }

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int tc = sc.nextInt();
			for(int i=0; i<tc; i++){
	    		int n = sc.nextInt();
	    		int[] arr1 = new int[n];
	    		for(int j=0; j<n; j++) {
	    			arr1[j] = sc.nextInt();
	    		} 
	    	    int[] arr2 = new int[n];
	    		for(int j=0; j<n; j++) {
	    			arr2[j] = sc.nextInt();
	    		}
	    		contractor(arr1, arr2, n);
			}
		} 
	}


