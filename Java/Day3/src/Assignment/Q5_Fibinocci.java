package Assignment;

import java.util.Scanner;

public class Q5_Fibinocci {

	public static void main(String[] args) {
		 int n, first = 0,second = 1;        
         System.out.println("Enter the limit");
         Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         if(n>1)
         { 
         System.out.print(first+" ");
         System.out.print(second);
         for (int i = 1; i<=n-2; ++i)
         {
             int sum = first + second;
             first = second;
             second = sum;
             System.out.print(" " + sum);
         } 
         }
         else if(n==1)
        	 System.out.print(first+" ");
         else
        	 System.out.print("Enter a valid limit");
         
	}

}
