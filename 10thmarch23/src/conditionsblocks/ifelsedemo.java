package conditionsblocks;

public class ifelsedemo {

	/*
	 * Syntax
	 * 
	 * if (condition) { // block of code to be executed if the condition is true }
	 * else { // block of code to be executed if the condition is false }
	 */
	public static void main(String[] args) {

		int a = 20;

		if (a < 15) {
			System.out.println("hiii");
		} else {

			System.out.println("hello");
		}
		/*
		 * ///IF ---Else IF--Else Syntax if (condition1) { // block of code to be
		 * executed if condition1 is true }
		 *
		 * else if (condition2) { // block of code to be executed if the condition1 is
		 * false and condition2 is true }
		 * 
		 * else { // block of code to be executed if the condition1 is false and
		 * condition2 is false }
		 */

		int b = 15;
		if (b < 15) {
			System.out.println("hiii");
		} else if (b > 10) {
			System.out.println("hello");
		} else if (b < 25) {
			System.out.println("hii1");
		} else {
			System.out.println("hell2");
		}

// marks  --  >90  -- distinction, >75 and <=90 --first class, >50 and <=75 --second class,
// <=50  --fail
		int m = 80;
		if (m > 90) {
			System.out.println("distiction");
		} else if (m > 75 && m <= 90) {
			System.out.println("first class");
		} else if (m > 50 && m <= 75) {
			System.out.println("second class");
		} else {
			System.out.println("fail");// first class
		}
	}
}
