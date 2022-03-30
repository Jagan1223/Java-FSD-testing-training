package Assignment;

import java.util.Scanner;

public class Q2_Encap2 {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 integers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Q2_Encap obj1=new Q2_Encap();
		obj1.setvalue(a, b);
		System.out.println("Sum = "+obj1.getValues());
		/*	Scanner sc=new Scanner(System.in);
		int i=1;
		System.out.println("Enter Id");
		int id=sc.nextInt();
		System.out.println("Enter Password");
		String password=sc.next();
		Q2_Encap obj1=new Q2_Encap();
		obj1.setId(id);
		obj1.setpass(password);
		System.out.println("Id = "+obj1.getId());
		System.out.println("Password = "+obj1.getpassword());*/
	}

}
