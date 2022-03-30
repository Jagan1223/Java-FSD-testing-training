package Assignment;

import java.util.Scanner;

public class Q2_ArrayGreatest {

	public static void main(String[] args) {
		int i,n,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array limit ");
		 n=sc.nextInt();		 
			 int [] arr=new int[n];
			 	System.out.println("Enter the values");
			 	for(i=0;i<n;i++)
			 	{
			 		arr[i]=sc.nextInt();
			 	}
			 	
			 	for(i=0;i<n;i++)
			 	{
			 		for(int j=i+1;j<n;j++)
			 		{
			 		if(arr[i]>arr[j])
			 		{
			 			temp=arr[i];
			 			arr[i]=arr[j];
			 			arr[j]=temp;
			 		}
			 		}			 		
			 	}
			 	System.out.println("Greatest element in the array is : "+arr[n-1]);
	}

}
