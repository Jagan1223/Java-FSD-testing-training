package File;

import java.io.File;
import java.io.IOException;
class FileCreate
{
	public static void main(String[] args)
	{
		try
		{
			File f1=new File("D:FileCreateExample.txt");
			if(f1.createNewFile())
			{
				System.out.println("a new file named "+f1.getName()+" has been created");
			}
			else
			{
				System.out.println("File already exists");
			}

		}
		catch(IOException e)
		{
			System.out.println("an unexpected error has occured");
			System.out.println(e);
		}
	}
}
