package Assignment;

import java.util.Scanner;

abstract class Abstract_Class
{
	abstract int getSum(int a,int b);  //abstract method
	abstract int getDiff(int a,int b); //abstract method
	double getDivision(int a,int b)   //non abstract method
	{
		return (double)a/b;
	}
}
class Child_Class extends Abstract_Class
{
	int getSum(int a,int b)
	{
		return a+b;
	}
	int getDiff(int a,int b)
	{
		return a-b;
	}
}
public class Q1a_Abstract
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 integer");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Abstract_Class t=new Child_Class();
		System.out.println("Sum = "+t.getSum(a, b));
		System.out.println("Difference = "+ t.getDiff(a, b));
		System.out.println("Division = "+t.getDivision(a, b));
	}

}
