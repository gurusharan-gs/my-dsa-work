
public class MaxInArray {
	
	public int maxInArray(int[] arr) {
		
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		MaxInArray ma = new MaxInArray();
		
		int[] arr = {1,2,5,8,2,10};
		
		int max = ma.maxInArray(arr);
		System.out.println("max "+ max);

	}

}
