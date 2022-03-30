package Array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		System.out.println("Enter 10 integer values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("The array elements entered are:");
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+",");
		}

	}

}
