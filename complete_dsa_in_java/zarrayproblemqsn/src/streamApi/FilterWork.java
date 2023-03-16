package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWork {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,5,45,15, 6, 8, 9, 10, 25);

		List<Integer> evenNum = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNum);

		
		list.stream().filter(e -> e > 5).forEach(System.out::println);
		
		System.out.println("__________________________________");

		
		int rlist = list.stream().reduce(0,(ans,i)-> ans+i);
		System.out.println(rlist);
		
		list.stream().sorted().forEach(s -> System.out.print(s+" "));
	}

}
