package Array;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		int n,i,sum=0;
	    System.out.println("Enter the size of the array");
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    int[] arr1 = new int[n];
	    int[] arr2 = new int[n];
	    int[] arr3 = new int[n];
	    System.out.println("Enter the elements of the array-1");
	    for(i=0;i<n;i++)
	    {
	      arr1[i]= sc.nextInt();
	    }
	    System.out.println("Enter the elemtns of the array-2");
	    for(i=0;i<n;i++)
	    {
	      arr2[i]= sc.nextInt();
	    }
	    for(i=0;i<n;i++)
	    {
	      arr3[i]= arr1[i]+arr2[i];
	    }
	    System.out.println("The sum of elements of the array is:");
	    for(i=0;i<n;i++)
	    {
	      System.out.print(arr3[i]+",");
	    }
	}

}
