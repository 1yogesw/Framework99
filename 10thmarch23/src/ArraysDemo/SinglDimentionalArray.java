package ArraysDemo;

import java.util.Arrays;

public class SinglDimentionalArray {
	// To store multiple values in singal variable of same datatype-
	// Array size is fixed-
	// you can't add new or delete the value in array , you can only replace/modify
	// the value
	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70 }; // Array declare

		System.out.println(a.length); // To find out the length

		System.out.println(a[4]); // I am accesing the value of specifi index

		// First Way to print for loop

		System.out.println(Arrays.toString(a));

		a[2] = 45; // replace the value of specific index

		System.out.println(Arrays.toString(a));

		// a[7]=78; //This is not possible

		// second way to print array using for loop--

		// 0 1 2 3 4 5 6
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
		
		  for (int k : a) {
		   if(k<40) {  
			   System.out.print((k) + " ");
		   }  }
		// Third Way --using for each loop-
		  /*   * for(datatype newVariableName: oldVariableName){
		   *    * sysout(newVariableName); }
		   *    * 
		   */  System.out.print("\n");
		  
		  String s[] = { "rahul", "ram", "ramesh" };
		  System.out.println(Arrays.toString(s));//using for loop
		    for (int i = 0; i < s.length; i++) {
		      if (i < 2) {
		    System.out.println(s[i]);   }
		     }

	// using for each loop-
		    
	for(String p:s)
	{
		if (p != "ramesh") {
			System.out.println(p);
		}
	}
	//second way to declare array
	//int a={10,20,30,40,50,60,70};
	
	int[] b=new int[5];
	b[0]=10;
	b[1]=20;
	b[2]=30;
	b[3]=40;
	
	System.out.println(Arrays.toString(b));
	
	
	int[] k=new int[5];
	
	
	int temp=10;
	
	for(int i=0;i<k.length;i++) {
		
		System.out.println(k[i]=temp);
		temp=temp+10;
	}
	
	System.out.println(Arrays.toString(k));
	}
	
}