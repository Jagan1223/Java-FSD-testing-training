package Assignment;

import java.util.Scanner;

class Calculation
{
	public void show()
	{
	System.out.println("Calculations..");	
	}
	
}
class Addition extends Calculation
{
	public void addition(int a,int b)
	{
		int x=a+b;
		System.out.println("Addition = "+x);	}
}
public class Q1_SingleInh {

	public static void main(String[] args) {
		int a,b,n;
		System.out.println("enter 2 integer");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		Addition ad=new Addition();
		ad.show();
		ad.addition(a, b);
			
	}

}
