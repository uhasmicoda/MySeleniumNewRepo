package stringProgrammes;

import java.util.LinkedHashSet;

public class RemovetheDuplicate {

	public static void main(String[] args) {
		String s = "aabbabaclkjhfgihhhhmmm";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		      set.add(ch);
		}
		System.out.println(set);
	}
	
	
}
