package Assignment;

import java.util.Scanner;

public class Q1_ArraySub {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter first string");
		 String s1=sc.nextLine();
		 System.out.println("enter second string");
		 String s2=sc.nextLine();
		boolean result=false;
		result=s1.contains(s2);
		 System.out.println(result);
	}

}
