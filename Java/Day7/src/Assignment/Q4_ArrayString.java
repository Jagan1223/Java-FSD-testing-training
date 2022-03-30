package Assignment;

import java.util.Scanner;

public class Q4_ArrayString {

	public static void main(String[] args) {
		int i,n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array limit ");
		 n=sc.nextInt();		 
			 String [] arr=new String[n];
			 String [] arr2=new String[n];
			 	System.out.print("Enter the values for Array 1");
			 	for(i=0;i<n;i++)
			 	{
			 		arr[i]=sc.next();
			 	}
			 	for(i=0;i<n;i++)
			 	{
			 		arr2[i]=arr[n-i-1];
			 	}
			 	System.out.println("Reversed values inside Array 2 :-");
			 	for(i=0;i<n;i++)
			 	{
			 	System.out.print(arr2[i]+"\t"); 
			 	}
	}
}
