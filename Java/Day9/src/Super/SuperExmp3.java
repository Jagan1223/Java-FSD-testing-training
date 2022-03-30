package Super;

class Animal2
{
	Animal2()
	{
		System.out.println("animal class constructor is called");
	}
}
class SuperExmp3 extends Animal2
{
	SuperExmp3()
	{
		super();
		System.out.println("sub class constructor is called");
	}
	public static void main(String[] args)
	{
		SuperExmp3 a=new SuperExmp3();
	}
}
