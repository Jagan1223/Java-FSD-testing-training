package Assignment;

import java.util.Scanner;

public class Q6_Strong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fact,i,n,last,total=0;
		System.out.print("Enter a number");
		n=sc.nextInt();
		int temp=n;
		while(n!=0)
		{
			i=1;
			fact=1;
			last=n%10;
			while(i<=last)
			{
				fact=fact*i;
				i++;
			}
		 total=total+fact;
			n=n/10;
		}
		if(total==temp)
			System.out.print(temp+" is a Strong number");
		else
			System.out.print(temp+" is Not a Strong number");

	}

}
