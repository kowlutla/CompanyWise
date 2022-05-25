package sortArray;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter elements into array: ");
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		method1(array);

	}
	
	
	public static void method1(int array[])
	{
		
		long start=System.nanoTime();
		int n=array.length;
		ascendingSort(array);
		descendingSort(array);
		
		for(int i=0;i<n;i=i+2)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for(int i=1;i<n;i=i+2)
		{
			System.out.print(array[i]+" ");
		}
		
		long end=System.nanoTime();
		System.out.println("\nTime Taken for Metohd1: "+(end-start));
	}

	private static void descendingSort(int[] array) {
		
		for(int i=1;i<array.length-2;i=i+2)
		{
			for(int j=1;j<array.length-i-2;j=j+2)
			{
				if(array[j]<array[j+2])
				{
					int temp=array[j];
					array[j]=array[j+2];
					array[j+2]=temp;
				}
			}
		}
		
	}

	private static void ascendingSort(int[] array) {
		
		for(int i=0;i<array.length;i=i+2)
		{
			for(int j=0;j<array.length-i-2;j=j+2)
			{
				if(array[j]>array[j+2])
				{
					int temp=array[j];
					array[j]=array[j+2];
					array[j+2]=temp;
				}
			}
		}
		
	}

}
