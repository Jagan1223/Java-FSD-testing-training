package File;

import java.io.FileWriter;
import java.io.IOException;
class FileWriteExample
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter obj1=new FileWriter("D:FileCreateExample.txt");
			obj1.write("I am writing to this file from the program");
			obj1.close();
			System.out.println("Content has been written to the file successfully");
		}
		catch(IOException e)
		{
			System.out.println("Some unexpected error has occured");
			System.out.println(e);
		}
	}
}