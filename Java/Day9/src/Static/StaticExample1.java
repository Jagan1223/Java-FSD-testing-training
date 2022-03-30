package Static;

public class StaticExample1 {
	static int count=0; // a.count, b.count, c.count
	StaticExample1()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		StaticExample1 a=new StaticExample1();
		StaticExample1 b=new StaticExample1();
		StaticExample1 c=new StaticExample1();
	}
}
