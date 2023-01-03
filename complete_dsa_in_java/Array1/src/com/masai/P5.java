package com.masai;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class P5 {

	    public static void dailyTemperatures(int n, int[] arr){
	        Stack<Integer> s = new Stack<>();
	        int[] ans = new int[n];
	        for(int i = n - 1; i >= 0; i--){
	            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
	                s.pop();  
	            } 
	            if(s.isEmpty()) ans[i] = 0;
	            else ans[i] = s.peek() - i;
	            s.push(i);
	        }
	        System.out.println(Arrays.toString(ans).replace("[","").replace("]","").replace(",",""));
	    }

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int tc = sc.nextInt();
			for(int i=0; i<tc; i++){
	    		int n = sc.nextInt();
	    		int[] arr = new int[n];
	    		for(int j=0; j<n; j++) {
	    			arr[j] = sc.nextInt();
	    		} 
	    		
	    		dailyTemperatures(n,arr);
	    // 		System.out.println(arr);
	    		
			}
		}
	}


