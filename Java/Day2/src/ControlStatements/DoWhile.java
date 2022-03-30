package ControlStatements;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*int i=1,n;
		System.out.println("enter a number");
		 n=sc.nextInt();
		do
		{
			System.out.println(i);
			i++;
		}while(i<=n);*/
		
		int i=1,n;
		System.out.println("enter a number");
		 n=sc.nextInt();
		do
		{
			System.out.println(n);
			n--;
		}while(n>=i);
	}

}
