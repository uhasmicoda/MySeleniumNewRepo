package stringProgrammes;
public class ArrangeWords {

	public static void main(String[] args) {
	String input="Programming3 Java1 Language4 Is2";
	String[] words = input.split(" ");
	String[] result = new String[words.length];
	for(String word: words) {
    int postion	=	word.charAt(word.length()-1)-'0';
    String actualWord = word.substring(0, word.length()-1);
    result[postion-1] = actualWord;
	}
	for(int i = 0; i<result.length; i++) {
		System.out.print(result[i]+" ");
		
		
	}

	}

}