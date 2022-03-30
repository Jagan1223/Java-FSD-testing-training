package Array;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the Integer array");
		int size=sc.nextInt();
		int[] arr1=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}

		System.out.println("The array elements entered are:");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr1[i]+",");
		}
	}

}
