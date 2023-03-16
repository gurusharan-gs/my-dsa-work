package collection_framework;

import java.util.ArrayList;

public class CollectionList {
	
	public static void main(String[] args) {
		
		
//		Collection -> this is one interface and this collection have two child 
//		1. list -> list also one interface and list have 3 child
		
//		   1. ArrayList -> class
//		   2. LinkedList -> class
//		   3. Vector -> class
		
		
//		2. set -> interface
	
//		   1. HashSet -> class
//		   2. LinkedHashSet -> class
//		   3. Vector -> class
		
//		4. sortedSet -> interface
//         1. TreeSet -> class
		
		
//		there are 2 types of collection have 
//		type safe collection 
//		un type safe collection
		
//		lets code 
//		List
		
//		type safe collection 
		ArrayList<String> names = new ArrayList<>();
		names.add("Sagar");
		names.add("Ramesh");
		names.add("Sachin");
		names.add("Najrin");
		names.add("Gaurva");
		
//		System.out.println(names);
		
//		returns the element present in the specified index
//		System.out.println(names.get(0));
//		System.out.println(names.get(1));
		
//		checks if the element is present in the arraylist
//		System.out.println(names.contains("Sagar"));
//		System.out.println(names.contains("Guru"));
		
//		returns the length of an arraylist
//		System.out.println(names.size());
		
		
//		names.clear();
//		System.out.println();
		
		
//		checks if the arraylist is empty
//		System.out.println(names.isEmpty());
		
		
		for (String str : names) {
			System.out.println(str);
		}
		
		System.out.println("_______________________________");
		
		names.forEach(s -> System.out.println(s));
		
		System.out.println("_______________________________");
		
		names.forEach(e -> {
			System.out.println(e);
		});
		
//		System.out.println("_______________________________");
		
//		un type safe collection 
//		ArrayList list = new ArrayList();
//		list.add("guru");
//		list.add(123);
//		list.add(true);
//		list.add(44.25);
//		System.out.println(list);
		
		
	}

}
