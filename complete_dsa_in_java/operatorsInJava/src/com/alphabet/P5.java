package com.alphabet;

import java.nio.file.DirectoryStream.Filter;
import java.util.List;

public class P5 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,18, 20, 22, 19,19,23, 23, 25, 13, 14, 15, 16, 17, 88);
		
//		numbers.stream().forEach(s -> System.out.println(s));
		
		

		numbers.stream().filter(n -> n % 2 == 1).sorted().distinct().forEach(s -> System.out.println(s));
//
////		print the square of all element
//		numbers.stream().map(n -> n * n).forEach(n -> System.out.println(n));
//
//		numbers.stream().filter(n -> n % 2 == 1).map(n -> n * n).forEach(n -> System.out.println(n));
//		
//		
//		
		List<String> list = List.of("DOG", "CAT");
//		list.stream().map(s -> s.toLowerCase()).forEach(s -> System.out.println(s));
	}

}
