package stringProgrammes;

import java.util.LinkedHashMap;

public class FindOccurrenceOfCharacterInString {

	public static void main(String[] args) {
		String s = "programming";
		LinkedHashMap<Character, Integer> hash = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (hash.containsKey(ch)) {
				hash.put(ch, hash.get(ch) + 1);
			} else {
				hash.put(ch, 1);
			}
			
		}
		System.out.print(hash);
	}

}
