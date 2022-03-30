package Throw;

public class FinallyExample3 {

	public static void main(String[] args) {
		try
		{
			int data=25/0;
			System.out.println("data="+data);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}

		System.out.println("Rest of the code");

	}

}
