package arr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 4, 8, 9, 12);

		Optional<Integer> opt = list.stream().reduce((a, b) -> a + b);
		System.out.println(opt.get());

//		List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
//		sort.forEach(s -> System.out.print(s + " "));

//		list.stream().sorted().collect(Collectors.toList()).forEach(s -> System.out.print(s+" "));;
//		sort.forEach(s -> System.out.print(s + " "));

		System.out.println();
		list.stream().filter(s -> s % 2 == 0).forEach(s -> System.out.print(s + " "));
		System.out.println();
		list.stream().filter(s -> s % 2 != 0).forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		list.stream().distinct().collect(Collectors.toList()).forEach(d -> System.out.print(d+" "));

		System.out.println();
		list.stream().distinct().sorted().filter(s -> s%2==0).map(s -> s*s).collect(Collectors.toList()).forEach(s -> System.out.print(s+" "));
	}

}
