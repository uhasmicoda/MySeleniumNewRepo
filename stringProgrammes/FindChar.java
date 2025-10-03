package stringProgrammes;
public class FindChar {
    public static void main(String[] args) {
        String input = "hello world";
        char target = 'o';  // character to find

        boolean found = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                System.out.println("Character '" + target + "' found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Character '" + target + "' not found in the string.");
        }
    }
}