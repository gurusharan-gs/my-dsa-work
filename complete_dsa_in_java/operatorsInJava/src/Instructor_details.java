
public class Instructor_details {

	String name;
	int age;
	String course_name;
	String coding_language;
	
	public Instructor_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instructor_details(String name, int age, String course_name, String coding_language) {
		super();
		this.name = name;
		this.age = age;
		this.course_name = course_name;
		this.coding_language = coding_language;
	}
	
	
	  void name(String name){
		      System.out.println(name);
		  }
	  
	  void age(String name, int age){
		     System.out.println(name+" "+age); 
		  }
	  
	  void courseName(String name, String course_name){
	      System.out.println(name+" "+course_name);

	  }
	  
	  void codingLanguage(String name, String coding_language){
	      System.out.println(name+" "+coding_language);

	  }
	  
	  public static void main(String[] args) {
		
		  Instructor_details obj = new Instructor_details();
		  obj.name("guru");
		  obj.age("guru", 25);
		  obj.courseName("guru", "developer");
		  obj.codingLanguage("guru", "java");

	}

	
}
