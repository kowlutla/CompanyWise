public class RSL2 {

	public static void main(String[] args) {

		// calling method to print multiplication table for 3
		multiplicationTable(3);
	}

	// method to print multiplication table of given number
	public static void multiplicationTable(int n) {

		// for multiple 1 to 10(inclusive both)
		for (int i = 1; i <= 10; i++) {

			// print multiplication for ith multiple of n
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}
}
