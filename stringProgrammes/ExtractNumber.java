package stringProgrammes;
public class ExtractNumber {

	public static void main(String[] args) {
		String input = "Aabb1235dd45ee1ff44";
		String number = "";
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				number = number + ch;
			} else if (!number.equals("")) {
				result = number + "," + result;
				number = "";

			}

		}
		if (!number.equals("")) {
			result = number + "," + result;
		}
		if (result.endsWith(",")) {
			result = result.substring(0, result.length() - 1);

		}
		System.out.println(result);

	}
}