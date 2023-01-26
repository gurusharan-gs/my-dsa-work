package interview_questions;

public class SpecialCharacterRemove {
	
	public static void specialCharacterRemove(String str) {
		
		int count = 0;
		String res = "";
		for(int i=0; i<str.length(); i++) {
			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
				count++;
			}else {
				res += str.charAt(i);
			}
		}
		if(count == 0) {
			System.out.println("No special character found in String");
		}else {
			System.out.println("special character found :"+ count);
		}
		System.out.println(res);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "BLackDog@&#=";
		specialCharacterRemove(str);

	}

}
