
public class SumArray {
	
	public int sum(int[] arr) {
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
        
		SumArray sa = new SumArray();
		
		int[] arr = {1,2,5,8,2,10};
		int x = sa.sum(arr);
		System.out.println("sum "+ x);
		
		
	

	}

}
