package stringProgrammes;
class ReverseLettersPreserveSymbols {
    public static void main(String[] args) {
        String str = "ab$C%d12!z";
        str = str.toLowerCase();  // Convert entire string to lowercase
        String s = str.replaceAll("[^a-zA-Z]", ""); // Extract only letters
        int l = s.length() - 1;  // Index for reverse letter position

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                // If it's a letter, print from the end of s (i.e., reversed)
                System.out.print(s.charAt(l));
                l--;
            } else {
                // If it's not a letter, print the character as it is
                System.out.print(str.charAt(i));
            }
        }
    }
}