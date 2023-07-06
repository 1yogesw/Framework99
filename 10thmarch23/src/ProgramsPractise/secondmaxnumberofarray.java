package ProgramsPractise;

public class secondmaxnumberofarray {
	public static void main(String[] args) {

		int a[] = { 30, 50, 23, 56, 67 }; //// 67 56 50 30 23

		// 50 30 23 56 67 --after 1 st iteration
		// 50 30 23 56 67 --after 2nd iteration
		// 56 30 23 50 67 --after 3rd iteration--
		// 67 30 23 50 56 --after 4th iteration--
		// 67 30 23 50 56 --after 5th iteration--
		// 67 50 23 30 56 --after 6th iteration--
		// 67 56 23 30 50 --after 7th iteration--
		// 67 56 30 23 50 --after 8th iteration--
		// 67 56 50 23 30 --after 9th iteration--
		// 67 56 50 30 23 --after 9th iteration--

		// 95 86 67 56 50 43 23 20

		int temp;

		for (int i = 0; i < a.length; i++) { // outer

			for (int j = i + 1; j < a.length; j++) { // inner loop

				if (a[i] < a[j]) { // a[0] < a[1] 30<50
					temp = a[i]; // temp = 30
					a[i] = a[j]; // 30 = 50
					a[j] = temp; // 50 = 30

				}

			}

		}
		System.out.println(a[1]);

	}

}
// < -- second large
// > -- second small
