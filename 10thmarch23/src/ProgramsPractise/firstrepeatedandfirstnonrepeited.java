package ProgramsPractise;

import java.util.HashMap;

public class firstrepeatedandfirstnonrepeited {

	public static void main(String[] args) {

		String a = "aabbccd";
		char ch[] = a.toCharArray();
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {

			if (hs.containsKey(ch[i])) {
				hs.put(ch[i], hs.get(ch[i]) + 1);
			} else {
				hs.put(ch[i], 1);
			}

		}
		// a 2 b 2 c=2 d=1
		for (int i = 0; i < ch.length; i++) {
			if (hs.get(ch[i]) == 1) {

				System.out.println("first non-repeted " + ch[i]);

				break;
			}
		}

		for (int i = 0; i < ch.length; i++) {
			if (hs.get(ch[i]) == 2) {

				System.out.println("first repeted " + ch[i]);

				break;
			}

		}

		//aabbccd	// a =2 b= 2 c=2 d=1
		
		for (int i=ch.length-1;i>=0;i--) {
			if (hs.get(ch[i]) == 1) {
				System.out.println("last non-repeted " + ch[i]);	
				break;
			}
			}
		
		for (int i=ch.length-1;i>=0;i--) {
			if (hs.get(ch[i]) > 1) {
				System.out.println("last repeted " + ch[i]);	
				break;

			}
			
		}
	}

}
