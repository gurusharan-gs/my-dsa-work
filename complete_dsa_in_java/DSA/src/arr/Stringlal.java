package arr;

public class Stringlal {
	
	public static void main(String[] args) {
		
//		Remove vowel like "a, e, i, o, and u" from given String string 
		
		String str = "gurusharan";
		
		String res = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				continue;
			}else {
				res += str.charAt(i);
			}
		}
		System.out.println(res);
		
		String ans = str.replaceAll("[aeiou]", "");
		System.out.println(ans);
		
	}

}
