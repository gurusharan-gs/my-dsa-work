package com.masai;

public class P1 {
	
    public static void subString(String str, int n)
    {
       for (int i = 0; i < n; i++)
           for (int j = i+1; j <= n; j++)
            System.out.println(str.substring(i, j));
    }
	
	public static void main(String[] args) {
		String str = "aman";
		subString(str, 4);
	}
	
//	a 
//	am 
//	ama 
//	aman 
//	m 
//	ma 
//	man 
//	a 
//	an 
//	n

}
