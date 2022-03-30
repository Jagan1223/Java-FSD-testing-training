package Array;

import java.util.Scanner;

public class TwoArray4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.println("ENTER THE ROWS AND COLUMNS");
	       int a,b;
	       a=sc.nextInt();
	       b=sc.nextInt();
	       char[][] arr1=new char[a][b];
	       System.out.println("enter the elements");
	       for(int i=0;i<a;i++) {
	    	   for(int j=0;j<b;j++) {
	    		   arr1[i][j]= sc.next().charAt(0);
	    	   }
	       }
	System.out.println("The elements are");
	for(int i=0;i<a;i++) {
		for(int j=0;j<b;j++) {
			System.out.print(arr1[i][j]+",");
		}
		System.out.println("");
	}

	}

}
