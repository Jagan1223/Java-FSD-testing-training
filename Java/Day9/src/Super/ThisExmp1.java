package Super;

class ThisExmp1
{
	int sum;
	ThisExmp1(int example)
	{
		this.sum=example;
	}
	void display()
	{
		System.out.println("sum="+sum);
	}
	public static void main(String[] args)
	{
		ThisExmp1 obj=new ThisExmp1(500);
		obj.display();
		ThisExmp1 two=new ThisExmp1(750);
		two.display();

	}
}