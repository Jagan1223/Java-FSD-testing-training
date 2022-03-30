package Basics;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=a/b;
		System.out.println("Division = "+c);

	}

}
