package stringProgrammes;

public class VowelCounter {

    public static void main(String[] args) {
        String input = "automation";
        int count = 0;

        String vowels = "aeiouAEIOU";  // all vowels

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // check manually if ch is present in vowels string
            for (int j = 0; j < vowels.length(); j++) {
                if (ch == vowels.charAt(j)) {
                    count++;
                    break; // no need to check further
                }
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}
