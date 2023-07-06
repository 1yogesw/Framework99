package ProgramsPractise;

public class countofnumberandchar1 {
	// Separate Number, Uppercase Letters, Lowercase Letters and Symbols

	public static void main(String[] args) {

		String s = "J#aD@4c2";

		String numbers = "";
		String lowerCaseLetter = "";
		String upperCaseLetter = "";
		String symbols = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (Character.isDigit(c)) {
				numbers += c;

			} else if (Character.isUpperCase(c)) {
				upperCaseLetter += c;

			} else if (Character.isLowerCase(c)) {
				lowerCaseLetter += c;

			} else {
				symbols += c;
			}
		}

		System.out.println("Numbers: " + numbers);
		System.out.println("Lower-Case Letters: " + lowerCaseLetter);
		System.out.println("Upper-Case  Letters: " + upperCaseLetter);
		System.out.println("Symbols: " + symbols);
	}
}

// Output
// Numbers: 42
// Lower-Case Letters: ac
// Upper-Case Letters: JD
// Symbols: #@
