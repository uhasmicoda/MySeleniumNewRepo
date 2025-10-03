package stringProgrammes;

public class ReverseCompleteSentence {

	public static void main(String[] args) {
		String input = "java is a programming language";
		String[] words = input.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			String word = words[i];
		    System.out.print(word+" ");
		}

	}

}
