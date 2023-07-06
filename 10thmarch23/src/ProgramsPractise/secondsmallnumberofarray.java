package ProgramsPractise;

public class secondsmallnumberofarray {
	
	
	public static void main(String[] args) {

		  int a[] = { 30, 50, 23, 56, 67, 86, 95, 43};    //23,30,43,50,56,67,86,95
		  
		  //1st=23,50,30,56,67,86,95,43
		  //

		  int temp;

		  for (int i = 0; i <a.length; i++) { //outer 

		  
		   for (int j = i + 1; j <a.length; j++) { //inner loop
		    
		    if (a[i] > a[j]) {  //a[0] >a[2]    30>23
		     temp = a[i];   //temp = 30
		     a[i] = a[j];  // 30 = 23
		     a[j] = temp;  // 23 = 30

		    }

		   }

		  }
		  System.out.println(a[1]);

		 }

		}

		//  <   -- second large
		//  >  -- second small


