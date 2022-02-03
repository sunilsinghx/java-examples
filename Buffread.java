// Reading from file using BufferedReader

import java.io.*;

public class Buffread
{
	public static void main(String []args) throws IOException
	{
		int ch;
		BufferedReader bf = new BufferedReader(new FileReader("File1.txt"));
		while((ch = bf.read())!= -1)
		{
			System.out.print((char)ch);
		}
	bf.close();
 	}
}