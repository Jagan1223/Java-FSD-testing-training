package Assignment;

import java.util.Scanner;

public class Q1_tryCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		try  
        {  
		int arr[]=new int[5];
		System.out.println("enter the array elements");
		for( i=0;i<=5;i++)
		{
			arr[i]=sc.nextInt();
		}
        }  
       catch(ArrayIndexOutOfBoundsException e)  
        {  
    	   System.out.println("Array elements exceeded the limit(5)");
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  

	}

}
