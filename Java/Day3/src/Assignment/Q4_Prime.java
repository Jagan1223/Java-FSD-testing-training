package Assignment;

import java.util.Scanner;

public class Q4_Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int n=sc.nextInt();  
        int i, j, count; 
		for(i = 1; i <= n; i++)
		{
			count = 0;
		    for (j = 2; j <= i/2; j++)
		    {
		    	if(i % j == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && i != 1 )
		    {
		    	System.out.print(i + " ");
		    }  
		}
		
	}
	

}
