package com.arrayquestions;

public class A {

	public static void main(String[] args) {

		String str = "hi $gaurav@$%#";
		int count = 0;
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetterOrDigit(str.charAt(i))) {
				count++;
			} else {
				res += str.charAt(i);
			}
		}
		System.out.println(count);
		System.out.println(res);

	}

}
