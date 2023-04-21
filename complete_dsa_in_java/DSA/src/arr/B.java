package arr;

public class B {
	
	public static void main(String[] args) {
		
		int x = 15;
		int y = 10;
		
		int count = 0;
		for(int i=1; i<=Math.min(x, y); i++) {
			if(x%i==0 && y%i==0) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
