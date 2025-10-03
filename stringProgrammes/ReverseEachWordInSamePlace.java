package stringProgrammes;

public class ReverseEachWordInSamePlace {

	public static void main(String[] args) {
		String name = "Allahamdulliah We are Muslim";
		String[] words = name.split(" ");
		String rev = "";
		
		for(String word: words) {
			for(int i = word.length()-1; i >=0; i--) {
				char ch = word.charAt(i);
				rev = rev+ch;
			}
			rev = rev +" ";
		}
		 
		
       System.out.print(rev);
	}

}
