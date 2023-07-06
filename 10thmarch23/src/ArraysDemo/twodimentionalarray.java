package ArraysDemo;

import java.util.Arrays;

public class twodimentionalarray {
	public static void main(String[] args) {

		// 0th Array 1st Array
		int a[][] = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 } };

		// Find out the length
		System.out.println(a.length); // 2
		System.out.println(a[0].length); // 4
		System.out.println(a[1].length); // 4
		System.out.println(a[0].length + a[1].length);

		// access the value of specific index

		// which array //which index
		System.out.println(a[0][3]); // 40
		System.out.println(a[1][0]); //50

		// row //column
		System.out.println(a[1][2]);

		// update /modify the value

		a[0][1] = 55;

		System.out.println(a[0][1]);

		// First Way
		System.out.println(Arrays.toString(a[0]) + Arrays.toString(a[1]));

		// int a[][]= {{10,55,30,40}, {50,60,70,80}};
		// using for loop-

		for (int i = 0; i < a.length; i++) { // outer for loop
			for (int j = 0; j < a[i].length; j++) { // inner for loop
				System.out.println(a[i][j]);

				// a[0][0]=10
				// a[0][1]=55
				// a[0][2]=30
				// a[0][3]=40
				// a[1][0]=50
				// a[1][1]=60
				// a[1][2]=70
				// a[1][3]=80
			}
	
}
		//using for each loop
		
		//int a[][]={{10,20,30,40},{50,60,70,80}};
		
		//a--2d array
		//arr2--single dimentional
		//arr2--10 20 30 40
		for (int[] arr2:a)
		{
			for(int val:arr2) 
				System.out.println(val);
		}
	
	}

}
		
		