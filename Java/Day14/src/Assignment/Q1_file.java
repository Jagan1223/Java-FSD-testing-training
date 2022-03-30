//Write a program to create, write and read from a file.
package Assignment;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Q1_file {
	public static void main(String[] args) {		
		try
		{		
			FileWriter f1=new FileWriter("D:NewFile.txt");
			Scanner sc=new Scanner(System.in);
			System.out.println("Write data to the file");
			String s=sc.nextLine();
			f1.write(s);		
			System.out.println("Data written successfully");
			f1.close();
			sc.close();
		}
		catch(IOException e)
		{
			System.out.println("an unexpected error has occured");
			System.out.println(e);
		}
		try
		{
			File f2=new File("D:NewFile.txt");
			Scanner sc1=new Scanner(f2);
			while(sc1.hasNextLine())
			{
				String fileData=sc1.nextLine();
				System.out.print("Reading data from the file..:  ");
				System.out.println(fileData);
			}			
			sc1.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("There is some unexpected Problem");
			System.out.println(e);
		}
		}		
	}


