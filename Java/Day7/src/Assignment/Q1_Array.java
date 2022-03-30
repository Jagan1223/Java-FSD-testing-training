package Assignment;

import java.util.Scanner;

public class Q1_Array {

	public static void main(String[] args) {
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array limit ");
		 n=sc.nextInt();		 
			 int [] arr=new int[n];
			 	System.out.println("Enter the values");
			 	for(i=0;i<n;i++)
			 	{
			 		arr[i]=sc.nextInt();
			 	}
			 	System.out.println("The duplicate array elements are :-");
			 	for(i=0;i<n;i++)
			 	{
			 		for(int j=i+1;j<n;j++)
			 		{
			 			if(arr[i]==arr[j])
			 			{
			 				System.out.println(arr[j]);
			 			}
			 		}			 		
			 	}
	}

}
