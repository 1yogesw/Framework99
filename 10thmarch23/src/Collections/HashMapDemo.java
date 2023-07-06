package Collections;

import java.util.HashMap;

public class HashMapDemo {
	//Map-interface
	//Hashmap-class
	//duplicates are not allowed
	//sequence is not fixed
	//only one null keys is allowed but multiple null values are allowed

	public static void main(String[] args) {

		HashMap<String, String> obj = new HashMap<String, String>();
		obj.put("MH", "Mumbai");
		obj.put("KR", "BLR" );
		obj.put("GJ","Gandinagar");
		obj.put("MH","mumbai");

		System.out.println(obj);
		// i want to fetch value using key
		System.out.println(obj.get("KR"));

		// i want print all the keys
		for (String k : obj.keySet()) {
			System.out.println(k);
		}

		// i want to print all the values

		for (String k : obj.values()) {
			System.out.println(k);
		}

		// i want to print both keys &values
		for (String k : obj.keySet()) {
			System.out.println(k + " " + obj.get(k));
			// MH obj.get("MH")
		}

	}
}