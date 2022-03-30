//INTERFACE
package Assignment;

import java.util.Scanner;

interface Calculation   //Interface 1 
{
	int rectangle(int lenght,int width);
	double circle(int radius);
}
interface Display       //Interface 2
{
	void getdisplay();
}
class Area implements Calculation   //class implements Interface 1
{
	Area()
	{
		System.out.println("**********");
	}
	public int rectangle(int lenght,int width) 
	{
		return lenght*width;
	}
	public double circle(int radius)
	{
		return radius*radius*3.14;
	}
}
class Perimeter implements Calculation,Display  //class implements interface 1 and 2
{
	Perimeter()
	{
		System.out.println("**********");
	}
	public int rectangle(int lenght,int width) 
	{
		return 2*(lenght+width);
	}
	public double circle(int radius)
	{
		return 2*3.14*radius;
	}
	@Override
	public void getdisplay() {
		System.out.println("End of the program");
	}	
}
public class Q1b_Interface {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and width of rectangle");
		int length=sc.nextInt();
		int width=sc.nextInt();
		System.out.println("Enter radius of Circle");
		int radius=sc.nextInt();		
		Calculation c=null;
		
		c=new Area();
		System.out.println("Area of Rectangle = "+c.rectangle(length, width));		
		System.out.println("Area of Circle = "+c.circle(radius));
		
		c=new Perimeter();
		System.out.println("Perimeter of Rectangle = "+c.rectangle(length, width));
		System.out.println("Perimeter of Circle = "+c.circle(radius));
		Display d=new Perimeter();
		d.getdisplay();
		
	}

}
