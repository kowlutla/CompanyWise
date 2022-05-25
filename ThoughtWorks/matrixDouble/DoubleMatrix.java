package matrixDouble;

import java.util.Scanner;

public class DoubleMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Rows: ");
		int row=sc.nextInt();
		System.out.print("Columns: ");
		int col=sc.nextInt();
		int array[][]=new int[row][col];
		System.out.println("Enter elements into array: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Actaul Matrix: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==0 || j==0 || i==col-1 || i==row-1 || j==col-1 || j==row-1)
				{
					array[i][j]=array[i][j]*2;
				}
				else
				{
					array[i][j]=array[i][j]/2;
				}
			}
		}
		
		System.out.println("\nAfter updating array: ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
	}

}
