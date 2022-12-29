package com.collecation;

import java.util.ArrayList;



public class ArrayListQ {
	
public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<>();
	
//	add new element
	list.add(1);
	list.add(4);
	list.add(45);
	list.add(10);
	list.add(15);
	list.add(25);	
//	System.out.println(list);
	
//	get an element at index 

//	System.out.println(list.get(4));
	
//	print with for loop
	
//	for(int i=0; i<list.size(); i++) {
//		System.err.print(list.get(i)+" ");
//	}

	
//	print the array list directly
	
//	System.out.println(list);
	
	
//	adding element at some index i
	list.add(4, 100);
	System.out.println(list);
	
//	modifying element at i
	
	list.set(5, 200);
	System.out.println(list);
	
//	removing an element at index i
	
	list.remove(5);
	System.out.println(list);
	list.remove(4);
	System.out.println(list);
	
//	removing an element e
	
	list.remove(Integer.valueOf(4));
	System.out.println(list);
	
//	checking if element exist
	
	boolean ans = list.contains(Integer.valueOf(10));
	System.out.println(ans);
	
//	if you don't specify class, you can put anything
	
	ArrayList l1 = new ArrayList();
	
	l1.add(12);
	l1.add(true);
	l1.add("guru");
	l1.add(12.3);
	System.out.println(l1);
	
	
	
}
	

}
