package com.steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AvgOfNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		double avg = list.stream().mapToInt(a -> a).average().getAsDouble();
		System.out.println(avg);
		
		
		List<String> li = new ArrayList<>();
		
		li.add("guru");
		li.add("sharan");
		li.stream().forEach(s -> System.out.println(s));
		
		
		
	} 
}
