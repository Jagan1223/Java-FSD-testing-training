package Assignment;

import java.util.Scanner;

public class Q8_Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,rem,sum=0;
		System.out.print("Enter a number");
		n=sc.nextInt();
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
		    sum =(sum*10)+rem;
		    n=n/10;			
		}
		if(sum==temp)
			System.out.print(temp+" is a Palindrome number");
		else
			System.out.print(temp+" is Not a Palindrome number");

	}

}
