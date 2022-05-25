/*
	Given an array of N positive integers and a positive number K
	Find the maximum sum of any contiguous sub array of size k
	
	Ex1:
	Input:{2,1,5,1,3,2}  k=3
 	Output:9
 	Explanation:{5,1,3};
 */
package maximumOfSubArrayOfSizeK;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class MaximumSubArraySumSlidingWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array Size: ");
		int n=sc.nextInt();
		System.out.print("Enter window size: ");
		int k=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements into array: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		method1(array,k);
		method2(array,k);
		sc.close();
		
		
	}

	
	
	private static void method1(int[]array,int k)
	{
		System.out.println("Brute Force method: ");
		long start=System.nanoTime();
		int maxsum=getMaximumSubArraySum1(array,k);
		System.out.println("Maximum Sub Array sum: "+maxsum);
		long end=System.nanoTime();
		System.out.println("Execution Time "+(end-start)+"ns");
	}
	
	//Brute force method
	//Time complexity:O(n*k)
	private static int getMaximumSubArraySum1(int[] array, int k) {
	
		int n=array.length;
		int max=0;
		for(int i=0;i<=n-k;i++)
		{
			int sum=array[i];
			for(int j=i+1;j<i+k;j++)
			{
				sum+=array[j];
			}
			max=Math.max(max, sum);
		}
		return max;
	}
	
	
	private static void method2(int[]array,int k)
	{
		System.out.println("\nSliding Window method: ");
		long start=System.nanoTime();
		int maxsum=getMaximumSubArraySum2(array,k);
		System.out.println("Maximum Sub Array sum: "+maxsum);
		long end=System.nanoTime();
		System.out.println("Execution Time "+(end-start)+"ns");
	}
	
	//Sliding window technique
	//Time complexity:O(n)
	private static int getMaximumSubArraySum2(int[] array,int k)
	{
		int n=array.length;
		int window_sum=0;
		int max_sum=0;
		for(int i=0;i<k;i++)
		{
			window_sum+=array[i];
		}
		max_sum=Math.max(max_sum, window_sum);
		for(int i=k;i<n;i++)
		{
			window_sum=window_sum+array[i]-array[i-k];
			max_sum=Math.max(max_sum, window_sum);
		}
		return max_sum;
	}
	
}
