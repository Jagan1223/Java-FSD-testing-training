package Assignment;

class Polymorphism
{
	public void show()
	{
		System.out.println("Polymorphism is the ability to take different forms.");
	}
	
}
class RuntimePoly extends Polymorphism
{
	public void show()
	{
		System.out.println("This type of polymorphism is acheived by method Overriding.");
	}
}
class CompiletimePoly extends Polymorphism
{
	public void show()
	{
		System.out.println("This type of polymorphism is acheived by function/operator Overloading.");
	}
}

public class Q2_RuntimePoly {

	public static void main(String[] args) {
		
		System.out.println("Main Class Loading....");
		Polymorphism p=new Polymorphism();
		p.show();
		p=new RuntimePoly();
		p.show();
		p=new CompiletimePoly();
		p.show();
						
	}

}
