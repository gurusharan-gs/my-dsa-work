package listquestionans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyList {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,5,7,8,5,6);
		System.out.println(list);
		List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
		
	}

}
