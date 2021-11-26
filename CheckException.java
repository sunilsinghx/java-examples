//checked exception
//it occur in compile time
import java.io.*;
class CheckException
{
	public static void main(String[] arg) throws IOException
	{
		
		try
		{
			throw new IOException();
		}
		catch(IOException e){
		System.out.prinln("Exception: "+e.getMessage);
		}
	}
}