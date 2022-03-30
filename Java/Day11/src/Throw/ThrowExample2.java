package Throw;

class UserDefinedException extends Exception
{
	public UserDefinedException(String str)
	{
		super(str);
	}
}
class ThrowExample2
{
	public static void main(String[] args)
	{


			try
			{
				throw new UserDefinedException("Just an Example");
			}	
			catch(UserDefinedException e)
			{
				System.out.println("Caught the User-defined exception");
				System.out.println(e);
			}
			System.out.println("rest of the code");
	}

}
