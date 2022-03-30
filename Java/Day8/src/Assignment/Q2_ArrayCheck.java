package Assignment;

import java.util.Scanner;

public class Q2_ArrayCheck {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter first string");
		 String s1=sc.nextLine();
		 System.out.println("enter the number of characters that we want to enter");
		 int n=sc.nextInt();
		 System.out.println("enter the characters ");
		 char a[]=new char[n];
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.next().charAt(0);
		 }
		 System.out.println("enter the characters are ");
		 for(int i=0;i<n;i++)
		 {
			 System.out.print(a[i]+" ,");
		 }
		 System.out.println(" ");
		 int count=0 ,i,j;
		 for( i=0;i<s1.length();i++)
		 {
			 char ch=s1.charAt(i);
			 
			 for( j=0;j<n;j++)
			 {
				 if(a[j]==ch)
				 {
					 System.out.println("Character "+a[j] +" found in the string "+s1);
					 count++;
				 } 
			 }
			 
		 }
		 if(count==0)
			 System.out.println("Character not found");
	}

}
