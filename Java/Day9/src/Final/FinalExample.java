package Final;

public class FinalExample {
	int a=5;
	void test()
	{
		a=350;
		System.out.println("a value after changing="+a);
	}
	public static void main(String[] args) {
		FinalExample a=new FinalExample();
		System.out.println("a ="+a);
		a.test();

	}

}
