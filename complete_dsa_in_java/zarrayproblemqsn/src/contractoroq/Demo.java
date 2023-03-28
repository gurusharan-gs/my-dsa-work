package contractoroq;

public class Demo {
	int roll;
	String name;
	int mark;

	public void showDetails() {
		System.out.println("roll " + roll);
		System.out.println("name " + name);
		System.out.println("mark " + mark);
	}

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public Demo(int roll, String name, int mark) {
		this.roll = roll;
		this.name = name;
		this.mark = mark;
	}

	public static void main(String[] args) {

		Demo d1 = new Demo(10, "ram", 785);
		d1.showDetails();
		System.out.println("------------------------------");
		Demo d2 = new Demo();
		d2.roll = 20;
		d2.name = "sagar";
		d2.mark = 889;
		d2.showDetails();

	}

}
