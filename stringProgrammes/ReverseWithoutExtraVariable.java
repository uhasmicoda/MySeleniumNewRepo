package stringProgrammes;

public class ReverseWithoutExtraVariable {

	public static void main(String[] args) {
		String s = "Mysuru";

		for (int i = s.length()- 1; i >= 0; i--) {
			char ch = s.charAt(i);
			System.out.print(ch);
		}
		
	}

}
