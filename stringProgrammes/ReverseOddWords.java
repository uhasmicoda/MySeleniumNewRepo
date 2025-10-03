package stringProgrammes;

public class ReverseOddWords {

    public static void main(String[] args) {
        String sentence = "Awarapan is amazing movie";

        // Split sentence into words
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            // Check for odd positions (1-based)
            if (i % 2 == 0) {  // 0,2,4,... = odd positions
                words[i] = reverseWord(words[i]);
            }
        }

        // Join words back into a sentence
        String result = String.join(" ", words);
        System.out.println(result);
    }

    // Method to reverse a word
    public static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed;
    }
}
