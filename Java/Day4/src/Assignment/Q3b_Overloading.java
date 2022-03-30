package Assignment;

import java.util.Scanner;

class Overloading {

	public int getresult(int a,int b)
		{
			return a+b;
		}
	public double getresult(double a,double b)
		{
		return a*b;		
		}
	public float getresult(float a,float b)
	{
	return a/b;		
	}
	
}
public class Q3b_Overloading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Overloading obj=new Overloading();
		//obj.getresult(1,2);
		//obj.getresult(4.5,6.7);
		System.out.println("enter 2 integer value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Sum of "+a+" and "+b+" = " +obj.getresult(a,b));
		
		System.out.println("enter 2 double value");
		double d1=sc.nextDouble();
		double d2=sc.nextDouble();	
		System.out.println("Multiplication of "+d1+" and "+d2+" = " +obj.getresult(d1,d2));
		
		System.out.println("enter 2 Float value");
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();	
		System.out.println("Division of "+f1+" and "+f2+" = " +obj.getresult(f1,f2));

	}

}
