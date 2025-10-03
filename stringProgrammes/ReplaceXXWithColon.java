package stringProgrammes;

public class ReplaceXXWithColon {

    public static void main(String[] args) {
        String input = "xXseleniumxXJavaxXManualxX";

        // Replace all "xX" with ":"
        String required = input.replace("xX", ":");

        // Remove leading colon if it exists
        if (required.startsWith(":")) {
            required = required.substring(1); // remove only first character
        }

        // Remove trailing colon if it exists
        if (required.endsWith(":")) {
            required = required.substring(0, required.length() - 1); // remove last character
        }

        System.out.println(required); // Output: selenium:Java:Manual
    }
}
