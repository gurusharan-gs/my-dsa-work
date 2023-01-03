package com.spiral;


	
	import java.util.*;
	import java.io.*;
	class Main{
	    public static void main(String[] args){
	        FastReader fs = new FastReader();
	        int n = fs.nextInt();
	        for(int i = 0; i <= n; i++){
	            String bag = "";
	            for(int j = n - i; j > 0; j--){
	                bag += "  ";
	            }
	            for(int j = 0; j <= i; j++){
	                bag += j+ " ";
	            }
	            for(int j = i - 1; j >= 0; j--){
	                bag += j+ " ";
	            }
	            System.out.println(bag);
	        }
	        for(int i = n - 1; i >= 0; i--){
	            String bag = "";
	            for(int j = n - i; j > 0; j--){
	                bag += "  ";
	            }
	            for(int j = 0; j <= i; j++){
	                bag += j +" ";
	            }
	            for(int j = i - 1; j >= 0; j--){
	                bag += j + " ";
	            }
	            System.out.println(bag);
	        }
	    }
	    static class FastReader{
	        BufferedReader br;
	    	StringTokenizer st;
	    	public FastReader(){
	      		br = new BufferedReader(new InputStreamReader(System.in));
	    	}
	    	String next(){
	      		while (st == null || !st.hasMoreElements()){
	                try { st = new StringTokenizer(br.readLine()); }
	        		catch (IOException e) { e.printStackTrace(); }
	      		}
	      		return st.nextToken();
	    	}
	    	int nextInt() { return Integer.parseInt(next()); }
	        long nextLong() { return Long.parseLong(next()); }
	  	    double nextDouble(){ return Double.parseDouble(next()); }
	    	String nextLine(){
	      	    String str = "";
	      		try { str = br.readLine(); }
	      		catch (IOException e) { e.printStackTrace(); }
	      		return str;
	    	}
	    }
	}


