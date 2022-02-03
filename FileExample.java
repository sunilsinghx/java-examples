//creating a file 
import java.io.File;
import java.io.IOException;
public class FileExample 
{
	public static void main(String []args) throws IOException
	{
	File f1 = new File("C:\\Users\\HP DR0002TX\\Desktop\\Java\\new\\fileop.txt");
	f1.createNewFile();
	System.out.println("Is exist (true/false):  "+f1.exists());
	System.out.println("File Size :"+f1.length());
	}
}