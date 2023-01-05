package com.day2;

public class P1 {
	
	public static boolean rotateString(String str, String goal)  {
		
		String res = str+str; // abcdeabcde
		                     
		
		if(str.length() != goal.length()) {
			return false;
		}
		return res.contains(goal);
	}
	
	
	public static void main(String[] args) {
		
		String str = "abcde";
		String goal = "edabc"; 
		boolean fl = rotateString(str, goal);
		System.out.println(fl);
		
	}

}
