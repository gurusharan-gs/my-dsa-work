package com.steam;

import java.util.ArrayList;
import java.util.List;

public class Problem {
	
public static void main(String[] args) {
	

	            List<Student> students = new ArrayList<>();
	            students.add(new Student(10,"Name1",850));
	            students.add(new Student(12,"Name2",750));
	            students.add(new Student(13,"Name3",650));
	            students.add(new Student(14,"Name4",950));
	            students.add(new Student(15,"Name5",750));

	            //Stream<Student> str1 = students.stream();

	            //Stream<Student> str2 = str1.filter(s -> s.getMarks() > 800);

	            //List<Student> anotherList =  str2.collect(Collectors.toList());

	            List<Student> anotherList= students.stream()
	                                                .filter(s -> s.getMarks() > 800);

	
}

}
