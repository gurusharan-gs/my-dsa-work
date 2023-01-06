package com.masai;

import java.util.HashSet;
import java.util.Scanner;


public class P8 {
//	happy number
	public static boolean isHappy(int n) {
	HashSet<Integer> hs = new HashSet<>();

	while(true){
	    int res = sqr(n);
	    if(res==1){
	        return true;
	    }else if (hs.contains(res)==true){
	        return false;
	    }
	    hs.add(res);
	    n=res;

	}
	    }

	    public static int sqr(int n ){
	        int sum=0;
	      while(n>0){
	          int x = n%10;
	          sum += x*x;
	          n=n/10;
	      }
	return sum;
	    }
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int tc = sc.nextInt();
	        while (tc-->0){
	            int n = sc.nextInt();
	            if(isHappy(n)){
	                System.out.println("Yes");
	            }else{
	                System.out.println("No");
	            }
	        }
	    }
	}


