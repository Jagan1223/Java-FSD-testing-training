package Assignment;

import java.util.Scanner;

public class Q3_Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int i,m=0,count=0,n;  
		 System.out.println("Enter an integer");
		 n=sc.nextInt(); 
		 for (i = 2; i <= n/2;i++)
			{
				if(n % i == 0)
			    {
					count++;
			        break;
			    }	
			}
			if(count == 0 && n != 1 )
			{
				System.out.println( n + " is a Prime Number");
			}
			else
			{
			   System.out.println(n + " is Not a Prime Number");
			} 
	    
		
	}

}
