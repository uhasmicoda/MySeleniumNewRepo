package stringProgrammes;
public class ReplaceWordManual {
    public static void main(String[] args) {
        String input = "I am a good coder";
        String[] words = input.split(" ");
        String output = "";
        
        for (String word : words) {
            if (word.equals("a")){
            	word = "an";
            }
            else if (word.equals("good")) {
            	word = "excellent";
            }
            output += word + " ";
        }

        System.out.println(output.trim());
    }
    
}
