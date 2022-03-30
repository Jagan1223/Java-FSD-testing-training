package Assignment;

import java.util.Scanner;

public class Q7_duck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,count=0,rem;
		System.out.print("Enter a number");
		n=sc.nextInt();
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			if(rem==0)			
				count++;
		    n=n/10;
						
		}
		if(count>0)		
			System.out.print(temp+" is a duck number");
		
		else	
			System.out.print(temp+" is not a duck number");
	}

}
