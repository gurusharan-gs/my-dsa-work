
public class ArrayIsSorted {
	
	public static boolean arrayIsSorted(int[] arr) {
		
		boolean cheak = true;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				cheak = false;
				break;
			}
		}
		return cheak;
		
	}
	
 public static void arrayIsSorted1(int[] arr) {
		
           List<Integer> list = new Arrays.asList(1,5,4,2,3,6,4,8);
	 list.stream().sorted().forEach(s -> System.out.print(s +" ");
		
	}

	public static void main(String[] args) {
		int[] arr = {5,2,3,5,5,7,2,5};
	
		boolean res = arrayIsSorted(arr);
		System.out.println(res);
		
		arrayIsSorted1();

	}

}
