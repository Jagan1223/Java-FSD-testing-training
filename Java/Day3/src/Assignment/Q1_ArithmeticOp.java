package Assignment;

import java.util.Scanner;

public class Q1_ArithmeticOp {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);		
		int a,b,sum=0,sub=0,mult=0,mode=0;
		double div=0;
		System.out.println("Enter two integers");
		a=sc.nextInt();
		b=sc.nextInt();
		
		sum= (a+b);
		sub=(a-b);
		mult=(a*b);
		div=(double) a/b;
		
		System.out.println("Sum = "+sum);
		System.out.println("Substration = "+sub);
		System.out.println("Multiplication = "+mult);
		System.out.println("Division = "+div);
		if (b==0)			
			System.out.println("Mode Operation is not possible while second Integer is Zero");
		else 
		   {
			mode= (a%b);
		    System.out.println("Remainder = " +mode);
		    }

	}

}
