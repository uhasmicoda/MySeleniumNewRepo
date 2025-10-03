package stringProgrammes;

public class ReverseString {

	public static void main(String[] args) {
	String s = "Mysuru";
	String rev = "";
     for (int i = s.length()-1; i >=0; i--) {
		char ch = s.charAt(i);
		rev = rev+ch;
	}
      System.out.print(rev);
	}

}
