package File;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class FileRead
{
	public static void main(String[] args)
	{
		try
		{
			File f1=new File("D:FileCreateExample.txt");
			Scanner sc=new Scanner(f1);
			while(sc.hasNextLine())
			{
				String fileData=sc.nextLine();
				System.out.println(fileData);
			}
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("There is some unexpected Problem");
			System.out.println(e);
		}
	}
}
