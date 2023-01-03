package com.spiral;

import java.util.Scanner;

public class Travels {
	
	    public static void circularTraversal(int n, int[][] arr){
	         int top = 0;
	         int left = 0;
	         int right = n-1;
	         int bottom = n-1;
	        StringBuilder bag =new StringBuilder("");
	         for(int i=bottom;i>=top;i--){
	             bag.append(arr[i][left]+" ");
	           
	         }
	         for(int i =left+1;i<=right;i++){
	             bag.append(arr[top][i]+" ");
	         }
	         for(int i =top+1;i<=bottom;i++){
	             bag.append(arr[i][right]+" ");
	         }
	         for(int i =right-1;i>=left+1;i--){
	             bag.append(arr[bottom][i]+" ");
	            
	         }
	       
	        System.out.println(bag);

	    }
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int tc=sc.nextInt();
	        for(int i=0;i<tc;i++){
	            int n=sc.nextInt();
	            int[][] arr=new int[n][n];
	            for(int j=0;j<n;j++){
	                for(int k=0;k<n;k++){
	                    arr[j][k]=sc.nextInt();
	                }
	            }
	            circularTraversal(n,arr);
	        }
	    }
	}


