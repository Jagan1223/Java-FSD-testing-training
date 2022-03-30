package Exception;

import java.util.Scanner;

public class ExceptionExmp9 {

	public static void main(String[] args) {
		try
		{//outer try
			try//inner try
			{
				System.out.println("we are going to divide by 0");
				System.out.println("Enter a number to divide");
				Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				int b=50/a;
				System.out.println("B="+b);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array index out of bounds");
			}
			catch(ArithmeticException e)
			{
				System.out.println("arithmetic exception");
			}

			int[] arr=new int[5];
			arr[7]=65;
		}//outer try closes
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bounds");
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
