/**
	Given three integers sort them in ascending order without using relational operators
 */
package sortThreeNumbers;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class SortThreeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num1: ");
		int n1=sc.nextInt();
		System.out.print("Enter num2: ");
		int n2=sc.nextInt();
		System.out.print("Enter num3: ");
		int n3=sc.nextInt();
		
		int[]sort=sortThree(n1,n2,n3);
		System.out.println("Min: "+sort[0]);
		System.out.println("Mid: "+sort[1]);
		System.out.println("Max: "+sort[2]);
		sc.close();
	}

	private static int[] sortThree(int n1, int n2, int n3) {
		
		int max=Math.max(n1, Math.max(n2, n3));
		int min=(Math.min(n1, Math.min(n2, n3)));
		int mid=(n1+n2+n3)-(min+max);
		
		return new int[] {min,mid,max};
	}

}
