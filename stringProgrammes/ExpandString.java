package stringProgrammes;

public class ExpandString {

	public static void main(String[] args) {
		String s = "a2b2a1b1a1c1d5";

		 for(int i = 0; i < s.length(); i = i + 2) {
			char ch = s.charAt(i);         // Get the character (like 'a', 'b')
			int count = s.charAt(i + 1) - 48; // Convert the digit character to int

			for (int j = 0; j < count; j++) { // j starts from 0
				System.out.print(ch);         // use print, not println to print in same line
			}
		  }

} }
