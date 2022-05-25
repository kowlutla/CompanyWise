
public class RSL4 {

	public static void main(String[] args) {

		// for numbers 100 to 500 (inclusive both)
		for (int i = 100; i <= 500; i++) {
			// if number is multiple of both 7 and 11
			if (i % 7 == 0 && i % 11 == 0) {
				// print as Not a valid output
				System.out.println("Not a valid output");
			}
			// if number is multiple of only 7 not 11
			else if (i % 7 == 0) {
				// print Raja
				System.out.println("Raja");
			}
			// if number is multiple of only 11 not 7
			else if (i % 11 == 0) {
				// print software
				System.out.println("Software");
			}
			// otherwise print original number
			else {
				System.out.println(i);
			}
		}
	}
}
