
public class RSL5 {

	public static void main(String[] args) {

		System.out.println(getFibOutput(7));

	}

	public static int getFibOutput(int n) {
		/*
		 * checking n is in fibnocci sequence if present return n
		 */
		if (isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4)) {
			return n;
		}
		// if n is not in fibnocci series
		else {

			int sum = 0;// sum to hold sum of even numbers in series
			int a = 0, b = 1;
			int c = 0;

			// checking next number in sequence does not cross n
			while (a + b < n) {
				// compute next number in squence
				c = a + b;
				// if number is even
				if (c % 2 == 0) {
					// add to sum
					sum += c;
				}
				// swap numbers
				a = b;
				b = c;
			}
			return sum;
		}
	}

	// helper method to check if number is perfect square or not
	private static boolean isPerfectSquare(int n) {
		int temp = (int) Math.sqrt(n);
		return temp * temp == n;
	}

}
