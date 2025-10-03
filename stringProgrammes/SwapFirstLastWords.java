package stringProgrammes;

public class SwapFirstLastWords {

    public static void main(String[] args) {
        String s = "Java is a programming language";

        // Split string into words
        String[] words = s.split(" ");

        // Swap first and last word
        String temp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;

        // Join words back into a single string
        String output = String.join(" ", words);

        System.out.println(output);
    }
}
