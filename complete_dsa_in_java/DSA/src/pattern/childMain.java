package pattern;

public class childMain extends Main{

	@Override
	public void myNameAbt(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
	public void childed() {
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		childMain cm = new childMain();
		cm.myNameAbt(5);
		cm.childed();
	}
}
