package Assignment;

import java.util.Scanner;

public class Q5_Palindrome {
	public static void main(String[] args) {
	 System.out.println("Enter a String");
		 Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
        String strArray[] = str.split(" ");

        System.out.println("String : " + str);
        System.out.print("String array : [ ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + ", ");
        }
        System.out.print("]"+"\n"); 
        
        String word;
        for(int i=0;i<strArray.length;i++)
        {
        	word=strArray[i];
        	char[] str1=new char[word.length()];
        	int count=0;
        	for(int j=word.length()-1;j>=0;j--)
        	{
        		str1[count]=word.charAt(j);
        		count++;
        	}
        	String word2=new String(str1);
        	 
        	if(word.equals(word2))
        	{
        		System.out.println("Palindrome word : "+word);
        	}
        }      
	}
}
