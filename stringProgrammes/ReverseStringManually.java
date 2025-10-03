package stringProgrammes;

public class ReverseStringManually {

    public static void main(String[] args) {
        String input = "Awarapan is amazing movie";

        // Loop from last character to first
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            System.out.print(ch);
        }
    }
}
