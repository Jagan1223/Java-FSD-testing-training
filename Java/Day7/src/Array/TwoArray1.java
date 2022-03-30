package Array;

import java.util.Scanner;

public class TwoArray1 {

	public static void main(String[] args) {
		int[][] arr=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values into the array");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		int[][] arr2=new int[2][2];

		System.out.println("enter the values into the 2nd array");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println("");
		}
		int[][] arr3=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr3[i][j]=arr[i][j]+arr2[i][j];
			}
		}
		System.out.println("the sum of the two arrays is");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println("");
		} 



	}

}
