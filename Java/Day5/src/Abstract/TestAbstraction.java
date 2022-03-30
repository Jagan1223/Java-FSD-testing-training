package Abstract;

abstract class Bike
{
	Bike()//constructor
	{
		System.out.println("Bike class is invoked");
	}
	void run()//non- abstract method
	{
	System.out.println("bike is running");
	}
	abstract void display();//abstract method
}
class Suzuki extends Bike
{
	void run()
	{
	System.out.println("Suzuki is running");
	}
	void display()// the abstract method is being implemented
	{
		System.out.println("Suzuki is a top tier bike");
	} 
}
public class TestAbstraction {

	public static void main(String[] args) {
		
		Bike obj=new Suzuki();
		obj.run();
		obj.display();

	}

}
