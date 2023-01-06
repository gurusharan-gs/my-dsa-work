package com.masai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P7 {

       //	 single character string
	    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    static StringTokenizer st = null;
	    static String next(){
	        while(st==null || !st.hasMoreElements()){
	            try{st = new StringTokenizer(sc.readLine());}
	            catch(IOException e){e.printStackTrace();}
	        }
	        return st.nextToken();
	    }
	    
	    public static void transform(String str){
	        HashMap<Character,Integer> map = new  HashMap<>();
			for(int i =0;i<str.length();i++) {
				map.computeIfPresent(str.charAt(i), (k,v)-> v+1);
				map.computeIfAbsent(str.charAt(i), (k)-> 1);
			}
	  
	      int count = 0;
		  int min = Integer.MAX_VALUE;
			for(Map.Entry<Character, Integer> k : map.entrySet()) {
				if(min>k.getValue()) {
					min = k.getValue();
				}
			}
			System.out.println(min);
	     
	    }
	   
	    
	    public static void main(String[] args){
	             int n = Integer.parseInt(next());
	            String str = next();
	           transform(str);
	        
	    }
	}


