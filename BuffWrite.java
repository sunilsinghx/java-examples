//writing to a file using BufferWriter 
import java.io.*;

public class BuffWrite
{
	public static void main(String []args) throws IOException
	{
		FileWriter fw = new FileWriter("FileBuffWrite.txt",true);
		BufferedWriter bf = new BufferedWriter(fw);
		bf.write("COMPUTEr");
		bf.close();
	}
}