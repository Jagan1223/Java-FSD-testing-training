package ControlStatements;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/*int i=10,n;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}*/
		Scanner sc=new Scanner(System.in);
		int i=1,n;
		System.out.println("enter a number");
		 n=sc.nextInt();
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
		
	}

}
