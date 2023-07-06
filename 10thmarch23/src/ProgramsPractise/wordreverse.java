package ProgramsPractise;

public class wordreverse {

	public static void main(String[] args) {

		String s = "Hello i love java"; // output --olleH i evol avaj

		String temp = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			temp = temp + s.charAt(i);
		}

		String words[] = temp.split(" "); // {"avaj", "evol", "i", "oleeh"}

		for (int i = words.length - 1; i >= 0; i--) {
			
			System.out.print(words[i] + " ");
		}

	}

}