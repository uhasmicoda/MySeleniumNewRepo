package stringProgrammes;

public class checkPalindromOrNot {

	public static void main(String[] args) {
		String s = "momy";
		String rev = "";
		
		for (int i = s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			rev = rev+ch;
			
		}
	
		if (s.equalsIgnoreCase(rev)) {
			System.out.println("String is palindrome");
		} 
		else {			
			System.out.println("String is not palindrome");
		}
	   }
	}
		
	
		


