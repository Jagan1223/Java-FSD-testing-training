package Assignment;

import java.util.Scanner;

public class Q2b_Ternary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter 3 integers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int result=a<b?(a<c?a:c):(b<c?b:c);
		System.out.print("Smallest number is "+result);
	}

}
