import java.io.*;
public class FileInputStream_example
{
	public static void main(String argd[]) throws IOException
	{
		int i;
		FileInputStream f1= new FileInputStream("C:\\Users\\HP DR0002TX\\Desktop\\Java\\new\\fileop.txt");
		do{
			i = f1.read();	//read contend of f1(fileop.txt );
			if(i != -1)
			{
				System.out.print((char)i);
			}
	     	}while(i!= -1);

	f1.close();
	}
}