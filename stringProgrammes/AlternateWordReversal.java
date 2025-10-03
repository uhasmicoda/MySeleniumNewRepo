package stringProgrammes;
public class AlternateWordReversal {
    public static void main(String[] args) {
        String input = "Roses are red violets are blue";
        String[] words = input.split(" ");
        String output = "";

        for(int i = 0; i < words.length; i++) {
            if ((i + 1) % 2 == 0) { // even-positioned word
                String reversed = "";
                for (int j = words[i].length() - 1; j >= 0; j--) {
                	char ch = words[i].charAt(j);
                    reversed += ch;
                }
                output += reversed + " ";
            } else {
                output += words[i] + " ";
            }
        }

        System.out.println("Output: " + output);
    }
}