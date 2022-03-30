//Write a program Implement the filereader until the file ending character is “-1” and print all the data of the file.
package Assignment;

import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;
//import java.io.FileNotFoundException;
import java.io.FileReader;
public class Q3_File {

	public static void main(String[] args) {
		
		try
		{		
			FileWriter obj1=new FileWriter("D:Q3_NewFile.txt");
			obj1.write("Program to Implement the filereader until the file ending character is “-1” and print all the data of the file.");
			obj1.close();		
		}
		catch(IOException e)
		{
			System.out.println("Some unexpected error has occured");
			System.out.println(e);
		}
		try
		{
		FileReader textFileReader = new FileReader("D:Q3_NewFile.txt");
		
		 int i;    
         while((i=textFileReader.read())!=-1)    
         System.out.print((char)i);    
         textFileReader.close();    
		}
		catch(IOException e)
		{
			System.out.println("Some unexpected error has occured");
			System.out.println(e);
		}
	}

}
