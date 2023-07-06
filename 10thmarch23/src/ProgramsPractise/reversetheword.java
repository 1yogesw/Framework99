package ProgramsPractise;

public class reversetheword {

	public static void main(String[] args) {

		String h = "Hello i love java";// 4

		// split the string using space--

		String words[] = h.split(" ");

		System.out.println(words.length);

		for (int i = 0; i < words.length; i++) {// outer loop

			String temp = words[i];

			String opposite = "";
			
			for (int j = temp.length() - 1; j >= 0; j--) {// inner loop

				opposite = opposite + temp.charAt(j);
			}

			System.out.print(opposite + " ");

		}
	}
}
