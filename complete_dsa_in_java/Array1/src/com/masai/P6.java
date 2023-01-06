package com.masai;

import java.util.Scanner;

public class P6 {
	

	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	            String s=sc.next();
	            String res = "";
	                for(int i=0;i<n;i++){
	                    int count=1;
	                while((i+1)<n && s.charAt(i)==s.charAt(i+1)){
	                   count++;
	                   i++;
	                }
	            res = res + s.charAt(i)+""+count;
	        }
	            System.out.println(res);
	    }
	  
	}


