package ControlStatements;

public class IfElse {

	public static void main(String[] args) {
		System.out.println("Start of the program");
		int a=22,b=20,c=29;
		if(a==b){
			System.out.println("a is equal to b");
		}
		else if(a==c)
		{
			System.out.println("a is equal to c");
		}
		else if (b==c) {
			System.out.println("b is equal to c");
		}
		else
		{
			System.out.println("none of the numbers are equal");
		}
		System.out.println("end of the program");

	}

}
