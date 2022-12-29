package com.collecation;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListP1 {

	public static void reverceArrayList(ArrayList<Integer> arr) {

		int i = 0, j = arr.size() - 1;

		while (i < j) {
			Integer temp = Integer.valueOf(arr.get(i));
			arr.set(i, arr.get(j));
			arr.set(j, temp);
			i++;
			j--;
		}

	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(15);
		list.add(10);
		list.add(2);
		list.add(6);

		System.out.println("original arr" + list);
//		reverceArrayList(list);
		Collections.reverse(list);
		System.out.println("reverce arr" + list);

		System.out.println("ascending order");
		Collections.sort(list);
		System.out.println(list);

		System.out.println("desc order");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

		ArrayList<String> str = new ArrayList<>();
		str.add("guru");
		str.add("gaurav");
		str.add("sujeet");
		str.add("naveen");
		str.add("suraj");
		str.add("dinesh");
		str.add("sanjan");
		str.add("chetan");
		str.add("himansh");

		Collections.sort(str);
		System.out.println(str);

		Collections.sort(str, Collections.reverseOrder());
		System.out.println(str);

//		for(int i=0; i<list.size(); i++) {
//			System.err.print(list.get(i)+" ");
//		}
//		System.out.println();
//		
//		for(int l : list) {
//			System.out.print(l+" ");
//		}
//		System.out.println();

	}
}
