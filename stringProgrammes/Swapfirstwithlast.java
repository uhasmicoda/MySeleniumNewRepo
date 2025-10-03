package stringProgrammes;

public class Swapfirstwithlast {

    public static void main(String[] args) {
        String s = "Java is a programming language";
        String output = "";
        // Split string into words
        String[] words = s.split(" ");

        // Swap first and last word
        String temp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;

        // Rebuild string (always add space, then trim at end)
       
        for (int i = 0; i < words.length; i++) {
            output = output + words[i] + " ";
        }
        output = output.trim();  // remove last extra space

        System.out.println(output);
    }
}
