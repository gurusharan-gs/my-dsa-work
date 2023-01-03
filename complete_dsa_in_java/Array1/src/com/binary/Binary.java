package com.binary;

import java.util.Scanner;

public class Binary {

	    public static void binarySearch(int n, int[] arr){
	        int start = 0; 
	        int end = n - 1;
	        while(start < end){
	            int mid = start + (end - start)/2;
	            if(arr[mid] > arr[end]){
	                start = mid + 1;
	            }else if(arr[mid] < arr[end]){
	                end = mid; 
	            }else {
	                end--;
	            }
	        }
	        if(start == 0){
	            System.out.println("NO");
	            return;
	        }
	        for(int i = 0; i < start - 1; i++){
	            if(arr[i] > arr[i + 1]){
	                System.out.println("NO");
	                return;
	            }
	        }
	        for(int i = start; i < n - 1; i++){
	            if(arr[i] > arr[i + 1]){
	                System.out.println("NO");
	                return;
	            }
	        }
	        System.out.println("YES");
	    }

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
	        // System.out.println(Arrays.toString(arr));
	        binarySearch(n,arr);
		}

	}


