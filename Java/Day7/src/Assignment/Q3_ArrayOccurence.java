package Assignment;

import java.util.Scanner;

public class Q3_ArrayOccurence {

	public static void main(String[] args) {
		int i,n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array limit ");
		 n=sc.nextInt();		 
			 int [] arr=new int[n];
			 	System.out.println("Enter the values");
			 	for(i=0;i<n;i++)
			 	{
			 		arr[i]=sc.nextInt();
			 	}
			 	System.out.println("Select a values to find the occurence");
			 	int x=sc.nextInt();
				for(i=0;i<n;i++)
			 	{
					if(arr[i]==x) {
						count++;
					}
			 	}
			 		System.out.println("Number of occurence of the integer "+x+" is "+count);
	}

}
