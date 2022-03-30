package Assignment;

import java.util.Scanner;

public class Q2_tryMultiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		int[] arr=new int[5];
		System.out.println("Enter an integer");
		a=sc.nextInt();
		System.out.println("Enter values");		
		try
		{
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(a/arr[0]);
		System.out.println(arr[6]);
		
		}
		catch(ArithmeticException exp)
		{
	            System.out.println(exp); 
		}
       catch(ArrayIndexOutOfBoundsException e)  
        {  
    	   
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
        
	}

}
