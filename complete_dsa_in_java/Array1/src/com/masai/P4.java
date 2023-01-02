package com.masai;

import java.util.Scanner;

public class P4 {
	
	    
	    public static void cipherString(int n, String str){
	            String res = "" + str.charAt(0);
	            int count = 1;
	            for(int i = 1; i < n; i++){
	                if(str.charAt(i) != str.charAt(i - 1)){
	                    res += count;
	                    res += str.charAt(i);
	                    count = 1;
	                }else{
	                    count++;
	                }
	            }
	            res += count;
	            System.out.println(res);
	     }
	   
	   
	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        int tc = sc.nextInt();
	        for(int i=0; i<tc; i++) {
	            int n = sc.nextInt();
	            String str = sc.next();
	            cipherString(n,str);
	        }
	      } 
	    } 


