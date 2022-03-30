package Operators;

import java.util.Scanner;

public class AssignmentOp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		a+=b; // a=a+b;
		System.out.println("Addition:"+a);
		a-=b;//a=a-b;
		System.out.println("Subtraction:"+a);
		a*=b;
		System.out.println("Multiplication:"+a);
		a/=b;
		System.out.println("Division:"+a);
		a%=b;
		System.out.println("Remainder:"+a); 
		//unary
		int c=1;
		c++;// c=c+1;
		System.out.println("c="+c);
		c--;//c=c-1;
		System.out.println("c="+c);
	}

}
