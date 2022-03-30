package Array;

import java.util.Scanner;

public class TwoArray2 {

	public static void main(String[] args) {
		int i,j;
	    System.out.println("Enter the value of row and column size of the array");
	    Scanner sc = new Scanner(System.in);
	    int row = sc.nextInt();
	    int col = sc.nextInt();
	    int[][] arr1 = new int[row][col];
	    int[][] arr2 = new int[row][col];
	    int[][] arr3 = new int[row][col];
	    System.out.println("Enter the values of the first array");
	    for(i=0;i<row;i++)
	    {
	      for(j=0;j<col;j++)
	      {
	        arr1[i][j] = sc.nextInt();
	      }
	    }
	    System.out.println("Enter the values of the second array");
	    for(i=0;i<row;i++)
	    {
	      for(j=0;j<col;j++)
	      {
	        arr2[i][j] = sc.nextInt();
	System.out.println("the sum is:");
	    for(i=0;i<row;i++)
	    {
	      for(j=0;j<col;j++)
	      {
	        System.out.print(arr3[i][j]+" ");
	      }
	      System.out.println("");
	    }

	}

	    }
	}
}
	
