package Collections;

import java.util.HashMap;

public class HashMapDemo1 {

	// Map- Interface
	// HashMap- class--

	// duplicates are not allowed
	// Sequence is not fixed
	// Null -- Only one null key is allowed but multiple null values are allowed

	public static void main(String[] args) {
		HashMap<String, String> obj = new HashMap<String, String>();// declare the hasmap

		obj.put("MH", null);
		obj.put(null, null);
		obj.put( "GJ",null);
		obj.put("india", "Delhi");

		System.out.println(obj);
		System.out.println(obj.containsKey("MH"));

		// i want to fetch value using key
		System.out.println(obj.get("KR"));

		// i want print all the keys--
		for (String k : obj.keySet()) {
			System.out.println(k);
		}

		// i want to print all the values-

		for (String k : obj.values()) {
			System.out.println(k);
		}

		// i want to print both key and values

		for (String k : obj.keySet()) {

			System.out.println(k + " " + obj.get(k));
			// MH obj.get("MH")
		}

		// remove , clear
		obj.remove("india", "Delhi");
		System.out.println(obj);

	}
}