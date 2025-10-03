package stringProgrammes;
public class ReplaceChars {
    public static void main(String[] args) {
        String input = "jhonny jhonny yes papa";
        // Output: thonny thonny yes nana
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Replace 'j' with 't' and 'p' with 'n'
            if (ch == 'j') {
                output += 't';
            } else if (ch == 'p') {
                output += 'n';
            } else {
                output += ch;
            }
        }

        System.out.println("Output: " + output);
    }
}