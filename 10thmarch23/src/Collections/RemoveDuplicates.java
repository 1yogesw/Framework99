package Collections;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String a = "raram";

		char[] b = a.toCharArray(); // This will convert to character array

		// char []b={'r','a','r','a','m'}

		HashSet<Character> hs = new HashSet<Character>(); // declare the arraylist

		for (char k : b) {

			hs.add(k); // r a m
		}

		System.out.println(hs);

		// OR
		for (char p : hs) {

			System.out.println(p);
		}

	}

}
