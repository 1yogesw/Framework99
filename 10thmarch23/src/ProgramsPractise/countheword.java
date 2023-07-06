package ProgramsPractise;

import java.util.Arrays;

public class countheword {

	public static void main(String[] args) {

		String h = "Hello i love java";// 4

		// split the string using space--

		String words[] = h.split("");
		
		System.out.println(Arrays.toString(words));

		System.out.println(words.length);//4

		for (int i = words.length - 1; i >= 0; i--) {

			System.out.print(words[i]+" "); //java love i hello
			
		}
		
		
	}

}
