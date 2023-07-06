package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	// List --interface
	// ArrayList --class
	public static void main(String[] args) {

		ArrayList<Integer> obj = new ArrayList<Integer>(); // declare the arraylist
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(10);

//First way
		System.out.println(obj); // 10 20 30 10

		obj.add(1, 12); // Add the element at specifci index

		System.out.println(obj); // 10 12 20 30 10

		System.out.println(obj.get(3)); // access the element at specifc index-

		obj.remove(1); // Remove the value at specifc index

		System.out.println(obj); // 10 20 30 10

		obj.set(2, 45); // replace the existing value
		System.out.println(obj);
		// second way to print arraylist using for loop
		// 0123
		for (int i = 0; i < obj.size(); i++) {
			System.out.print(obj.get(i));
		}

		// third way to print arraylist using for each loop
		for (int j : obj) {
			System.out.println(j);
		}
		obj.clear();
		System.out.println(obj);
	}

}
