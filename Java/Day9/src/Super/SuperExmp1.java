package Super;

class Animal// super-class/ parent-class
{
	String color="white";
}
class SuperExmp1 extends Animal
{
	String color="brown";
	void printcolor()
	{
		System.out.println(color);//brown
		System.out.println(super.color);//white
	}
	public static void main(String[] args)
	{
		SuperExmp1 obj1=new SuperExmp1();
		obj1.printcolor();
	}
}
