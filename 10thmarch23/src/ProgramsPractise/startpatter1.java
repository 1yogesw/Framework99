package ProgramsPractise;

public class startpatter1 {

	public static void main(String[] args) {

		// 0 1 2 3 4
		for (int i = 0; i <= 5; i++) {// outer for loop --//number of rows

			for (int j = 5; j > i; j--) { // inner for loop1
				System.out.print(" "); // To print the spaces
			}

			for (int p = 0; p <= i; p++) { // inner for loop2

				System.out.print("*"); // To print the stars
			}

			System.out.println(); // To move the control to next line
			
			
		}
	
		for (int i=0; i<=4; i++) {
		
			for(int j=4-i; j>1; j--) {
				System.out.print(" ");
			}
			 
			for (int j=0; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
			}
		
		
		}
				
			}
			
		
		
		
	


