import java.util.Arrays;

public class RSL3 {

	public static void main(String[] args) {

		int array1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int array2[] = { -1, -2, -3, -4, -5 };
		System.out.println(Arrays.toString(merge(array1, array2)));
	}

	public static int[] merge(int array1[], int array2[]) {
		// length of first array
		int length1 = array1.length;
		// length of second array
		int length2 = array2.length;

		// creat array with size of length1+length2
		int result[] = new int[length1 + length2];
		// indexs to point starting index of array1,array2,result respectively
		int index1 = 0, index2 = 0, index3 = 0;

		// merge the two arrays until at least one array completely copied
		while (index1 < length1 && index2 < length2) {
			// store the value of first array in result
			result[index3++] = array1[index1++];
			// then store the value of second array in result
			result[index3++] = array2[index2++];
		}

		/*
		 * incase if array1 contain some more elements to copy which means size of
		 * array2 is less than array1 copy remaining elements of first array to result
		 * array
		 */
		while (index1 < length1) {
			result[index3++] = array1[index1++];
		}

		/*
		 * incase if second array contain some more elements to copy which means size of
		 * second array is greater than first array copy remaining elements of second
		 * array to result array
		 */
		while (index2 < length2) {
			result[index3++] = array2[index2++];
		}
		// return the resulted array
		return result;
	}
}
