package Assignment;

import java.util.Scanner;

class Calculation2  //Parent Class
{
	public void show()
	{
	System.out.println("Calculations..");	
	}
	
}
class Addition2 extends Calculation2  //Child Class inherits parent class
{
	public void addition(int a,int b)
	{
		int x=a+b;
		System.out.println("Addition = "+x);	}
}
class Substraction1 extends Calculation2   //Child Class inherits parent class
{
	public void sub(int a,int b)
	{
		int x=a-b;
		System.out.println("Substraction = "+x);	}
}
public class Q1_HeirarchyInh {

	public static void main(String[] args) {
		int a,b,n;
		System.out.println("enter 2 integer");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		Substraction1 s=new Substraction1();
		s.show();
		//s.addition(a, b); //error because GrandChild class does not inherit Child Class
		s.sub(a, b);
		Addition2 ad=new Addition2();
		ad.show();
		ad.addition(a, b);

	}

}
