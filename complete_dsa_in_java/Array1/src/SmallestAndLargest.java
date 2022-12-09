import java.util.Arrays;

public class SmallestAndLargest {
	
	public static int[] smallestAndLargestElement(int[] arr){
		
		Arrays.sort(arr);
		
		int[] res = {arr[0], arr[arr.length-1]};
		
		return res;
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {5,2,3,5,5,7,2,5};
		
		int[] res = smallestAndLargestElement(arr);
		for(int s : res) {
			System.out.println(s);
		}
	}

}
