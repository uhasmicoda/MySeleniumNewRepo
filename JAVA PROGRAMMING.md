## JAVA STRING PROGRAMMING

## 1 Reverse AlterNet words

```java

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

```
String.split(" ") → Splits a sentence into words.

(i+1) % 2 == 0 → Checks if word is at even position (since index starts from 0).

charAt() → Used to get each character from a word.

String concatenation (+=) → Builds reversed word step by step.

Final output is built by combining odd-positioned words (normal) + even-positioned words (reversed).

## 2 Sum of numbers in string

```java

package stringProgrammes;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		String s = "abc999";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				sum = sum + ch - 48;
			}
		}
		System.out.println(sum);

	}
}

```

🧩 Logic Explanation (Step-by-Step)

Input String:
The string "abc999" contains both letters and digits.

Initialize sum:
int sum = 0;
This will store the total of all digits found in the string.

Loop Through Each Character:
for (int i = 0; i < s.length(); i++) { ... }

The loop runs from index 0 to the last character.

Each character is checked one by one.

Get Each Character:
char ch = s.charAt(i);

charAt() returns the character at the given index.

Check if It’s a Digit:
if (ch >= '0' && ch <= '9')

Characters '0' to '9' have ASCII values 48 to 57.

This condition ensures we only process digits, not letters.

Convert Character to Integer Value:
sum = sum + ch - 48;

'0' in ASCII = 48

'1' in ASCII = 49

'2' in ASCII = 50
So, to get the actual number, we subtract 48.
Example: '9' - 48 = 57 - 48 = 9

Print the Result:
System.out.println(sum);
This prints the total sum of digits.
