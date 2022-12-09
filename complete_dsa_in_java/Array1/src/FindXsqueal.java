
public class FindXsqueal {
	
	public int findXEquealTo(int[] arr, int x) {
		int res = -1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindXsqueal find = new FindXsqueal();
		
		int[] arr = {1,2,5,8,2,10};
		int x = 2;
		
		int res = find.findXEquealTo(arr, x);
		System.out.println("array index is "+res);

	}

}
