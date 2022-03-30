package Exception;

public class ExceptionExmp6 {

	public static void main(String[] args) {
		try
		{
			int[] arr1=new int[5];
			System.out.println(arr1[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The array element cannot be accessed because it's index is greater than the size");
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
