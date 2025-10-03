package stringProgrammes;

public class ReplaceVowels {

    public static void main(String[] args) {
        String s = "Java is a programming language";
        String output = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                output = output + '@';   // replace vowel
            } else {
                output = output + ch;    // keep other chars
            }
        }

        System.out.println(output);
    }
}
