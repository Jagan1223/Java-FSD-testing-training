package IOStream;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
class SampleReadExmp
{
	public static void main(String[] args)throws IOException
	{
		File file1=new File("D:SampleOutputWriter.txt");
		int len=(int) file1.length();
		try(FileReader fr=new FileReader(file1))
		{
			int c;
			while((c=fr.read())!=-1)
			{
				System.out.print((char)c);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}