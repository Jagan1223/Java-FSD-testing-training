package File;

import java.io.File;
class FileGetExample
{
	public static void main(String[] args)
	{
		File f1=new File("D:FileCreateExample.txt");
		if(f1.exists())
		{
			System.out.println("The file name is: "+f1.getName());
			System.out.println("Is the file Writeable: "+f1.canWrite());
			System.out.println("The absolute Path of the file is: "+f1.getAbsolutePath());
			System.out.println("Is the file Readable: "+f1.canRead());
			System.out.println("The size of the file in bytes: "+f1.length());
		}
		else
		{
			System.out.println("the file does not exist");
		}
	}
}