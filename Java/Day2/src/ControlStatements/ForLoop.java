package ControlStatements;

import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		for (int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+ " ");
				//i--;
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
		}	
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
		}	
	}

}
