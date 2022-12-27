package com.masai;

import java.util.HashSet;
import java.util.Scanner;

public class P3 {

	public static void min(String str) {

		HashSet<String> hs = new HashSet<>();
		int min = 0;

		for (int i = 0; i < str.length(); i++) {
			// System.out.println(str.charAt(i));
			hs.add(str.charAt(i) + "");
		}

		// System.out.println(hs.size());
		for (int i = 0; i < str.length(); i++) {
			String bag = "";

			for (int j = i; j < str.length(); j++) {

				bag += str.charAt(j);
				HashSet<String> hs1 = new HashSet<>();

				for (int k = 0; k < bag.length(); k++) {
					hs1.add(bag.charAt(k) + "");
				}

				if (hs.size() == hs1.size()) {

					if (min == 0) {
						min = bag.length();
					}
					if (min > bag.length()) {
						min = bag.length();
					}

				}
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "zoomsessionmooz";

		min(str);

	}

}