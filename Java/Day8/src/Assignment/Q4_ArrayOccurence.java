package Assignment;

import java.util.Scanner;

public class Q4_ArrayOccurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter a string");
		 String s1=sc.nextLine();
		 System.out.println("Enter the character");
		 char ch=sc.next().charAt(0);
		 System.out.println("You have entered: "+ch);
		 int count=0;
		 for(int i=0;i<s1.length();i++)
		 {
			 if(s1.charAt(i)==ch)
				 count++;
		 }
		 if (count==0)
			 System.out.println("Character is not found");	
		 else
			 System.out.println("The number of times '"+ch+"' appeared = "+count);
	}
		 
		 
}


