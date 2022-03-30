package Array;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		/*String[] arr={"Adithya","arun","swetha"};
		System.out.println(arr[1]);*/
		System.out.println("enter the size of string array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String[] arr=new String[size];
		System.out.println("enter the String values of the array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();  
		}
		System.out.println("the values entered is:-");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}


	}

}
