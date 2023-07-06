package ProgramsPractise;

import java.util.HashMap;

public class Occuranceofcharactersusinghashmap {

	public static void main(String[] args) {

		String a = "dgdhha dg";// output
		// d=2,g=1,h=2,a=1

		String b = a.replaceAll(" ","");
		char ch[] = b.toCharArray();

		// converting to charactor array
		// ch[]={'d','g','d',h','h','a'} //
		// key //value //key value
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		// d 2
		// g 1
		// h 2
		// a 1

		for (int i = 0; i < ch.length; i++) { // applied for loop over the char array

			if (hm.containsKey(ch[i])) {

				hm.put(ch[i], hm.get(ch[i]) + 1);

				// hm.put(d, 2)
				// hm.put(h, 2)

			} else {
				hm.put(ch[i], 1); //
				// hm.put( d, 1)
				// hm.put(g, 1)
				// hm.put(h,1)
				// hm/put(a,1)

			}

		}

		
		
		System.out.println(hm);

		/*
		 * for (char i : hm.keySet()) {
		 * 
		 * System.out.println(i + "" + hm.get(i));
		 * 
		 * }
		 */
	}

}
