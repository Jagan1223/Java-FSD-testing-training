package Assignment;

import java.util.Scanner;

public class Q3_ArrayReverse {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a string");
		 String s1=sc.nextLine();
		 char[] ch=new char[s1.length()];
		 for(int i=0;i<s1.length();i++)
		 {
			 ch[i]=s1.charAt(i);
		 }
		 System.out.println("The character array is ");
		 for(int i=0;i<s1.length();i++)
		 {
			 System.out.print(ch[i]);
		 }
		 System.out.println("");
		 System.out.println("reverse order");
		 for(int i=s1.length()-1;i>=0;i--)
		 {
			 System.out.print(ch[i]);
		 }
		 System.out.println("");
		 System.out.println("The reversed Array to another string..");
		 for(int i=s1.length()-1;i>=0;i--)
		 {
			 String s=String.valueOf(ch[i]);
			 System.out.print(s);
		 }
	}

}
