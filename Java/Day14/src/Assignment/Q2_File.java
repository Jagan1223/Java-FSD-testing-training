//Write a program to get the information about the file.
package Assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
public class Q2_File {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("D:FileCreateExample.txt");
		FileWriter obj1=new FileWriter("D:FileCreateExample.txt");
		obj1.write("Hello World..This is a Java File Program");
		obj1.close();
		if(f1.exists())
		{
		System.out.println("The file name is: "+f1.getName());
		System.out.println("Is the file Writeable: "+f1.canWrite());
		System.out.println("The absolute Path of the file is: "+f1.getAbsolutePath());
		System.out.println("Is the file Readable: "+f1.canRead());
		System.out.println("The size of the file in bytes: "+f1.length());
		System.out.println("Hidden: " + f1.isHidden());//Returns true if the specified Path locates a file that is considered hidden by the file system.
		System.out.println("lastModifiedTime: " + f1.lastModified());//Returns  the specified file's last modified time.
		System.out.println("isDirectory: " + f1.isDirectory());//Returns true if the specified Path locates a file that is a directory.
		}
		else
		{
			System.out.println("the file does not exist");
		}
		
	
		
	}

}
