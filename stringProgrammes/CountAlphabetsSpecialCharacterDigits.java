package stringProgrammes;

public class CountAlphabetsSpecialCharacterDigits {

	public static void main(String[] args) {
		String s = "Saddam@123";
		int alphaCount = 0, digitCount = 0, specialCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				digitCount++;
			} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				alphaCount++;
			} else
				specialCount++;
		}

		System.out.println("alphabet: " + alphaCount);
		System.out.println("digit: " + digitCount);
		System.out.println("special: " + specialCount);

	}

}
