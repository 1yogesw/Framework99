package ProgramsPractise;

public class string2 {

	public static void main(String[] args) {

		// 0 1 2 3 4

		String s = "rahul";
		for (int i = 0; i < s.length() - 1; i = i + 2) {

			System.out.print(s.charAt(i));// rh
			if (s.charAt(i) == 'h') {
				System.out.print(s.charAt(i + 1));// u

			}

		}
	}
}
