
public class RSL1 {

	public static void main(String[] args) {

	}

	// method to check all characters are repeated or not in string
	public static boolean isRepeated(String s) {

		// create count array to count occurence of each character in string
		int count[] = new int[256];

		// for all characters in string
		for (int i = 0; i < s.length(); i++) {
			// increment the occurence count in array
			count[s.charAt(i)]++;
		}

		// look occurence of each character in count array
		for (int i = 0; i < 256; i++) {
			// if any character appeared only one time
			if (count[i] == 1) {
				// return false;
				return false;
			}
		}
		// return true as all characters are repeated
		return true;
	}

}
