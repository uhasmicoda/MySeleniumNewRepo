package stringProgrammes;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CharCountCompressor {
    public static void main(String[] args) {
        String input = "aaaAA#bbB-cCCC$dDm";
        String str = input.replaceAll("[^a-zA-Z]", "");
        str = str.toLowerCase();
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
        	
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
            	char ch = str.charAt(i);
            	
                System.out.print(ch + "" + count + " ");
                count = 1;  // reset count
            }
        }

        // Print the last character group
        System.out.print(str.charAt(str.length() - 1) + "" + count + " ");
    }
}
