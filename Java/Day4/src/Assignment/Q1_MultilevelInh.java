package Assignment;

import java.util.Scanner;

class Calculation1  //Parent Class
{
	public void show()
	{
	System.out.println("Calculations..");	
	}
	
}
class Addition1 extends Calculation1  //Child class inherits Parent class
{
	public void addition(int a,int b)
	{
		int x=a+b;
		System.out.println("Addition = "+x);	}
}
class Substraction extends Addition1  //GrandChild class inherits Child class
{
	public void sub(int a,int b)
	{
		int x=a-b;
		System.out.println("Substraction = "+x);	}
}
public class Q1_MultilevelInh {

	public static void main(String[] args) {
		int a,b,n;
		System.out.println("enter 2 integer");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		Substraction s=new Substraction();
		s.show();
		s.addition(a, b);
		s.sub(a, b);
		
	}

}
