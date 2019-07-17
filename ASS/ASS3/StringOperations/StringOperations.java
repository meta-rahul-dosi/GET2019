import java.util.*;

public class StringOperations {
	public static void main(String[] args) {
		StringOperations obj = new StringOperations();
		String string1 = obj.input();
		String string2 = obj.input();
		int check = c.compare(s1, s2);

		if (check == 0)
			System.out.println("unequal strings");
		else
			System.out.println("equal strings");

		c.reverse();
	}

	String input() {
		System.out.println("enter string : ");
		Scanner ss = new Scanner(System.in);
		String s1 = ss.nextLine();
		return s1;
	}

	int compare(String string1, String string2) {
		int check = 0;
		if (string1.length() == string2.length()) {
			for (int i = 0; i < string1.length(); i++) {
				if (string1.charAt(i) == string2.charAt(i))
					check++;
				else
					return 0;
			}
		}

		else
			return 0;

		if (l != 0)
			return 1;

		return l;
	}

	void reverse() {
		System.out.println("Enter any string for further operations :");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reversed string is:" + reverse);
		System.out.println("after swapping the cases : " + swapCase(str));
		System.out.println("largest letter in entered string is "
				+ largestLetter(str));
	}

	String swapCase(String str) {
		int asciiValueOfChar = 0;
		int convertedCaseAsciiValue = 0;
		String caseConvertedString = "";
		for (int index = 0; index < str.length(); index++) {
			asciiValueOfChar = str.charAt(index);

			if (asciiValueOfChar >= 65 & asciiValueOfChar <= 90) {
				convertedCaseAsciiValue = asciiValueOfChar - 65 + 97;

			} else if (asciiValueOfChar >= 97 & asciiValueOfChar <= 122) {
				convertedCaseAsciiValue = asciiValueOfChar - 97 + 65;
			} else {
				convertedCaseAsciiValue = asciiValueOfChar;
			}

			caseConvertedString += (char) (convertedCaseAsciiValue);

		}
		return caseConvertedString;
	}

	char largestLetter(String s) {
		String str = s.toUpperCase();
		int asciiValue = 0;
		int previousAsciiValue = 0;
		char largest = 0;
		for (int i = 1; i < str.length(); i++) {
			previousAsciiValue = str.charAt(i - 1);
			asciiValue = s.charAt(i);
			if (previousAsciiValue > asciiValue)
				largest = str.charAt(i - 1);
			else
				largest = str.charAt(i);
		}
		return largest;
	}
}
