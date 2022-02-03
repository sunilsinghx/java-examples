import java.io.*;
//error
public class FileOutputStream_example
{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileOutputStream fout = new FileOutputStream("./outputfile.txt",true);	//creating new object of fileoutputstream putting true in constructor for appending
		String s = "hello there i am program";
		char ch[] = s.toCharArray();
		for(i=0; i< s.length(); i++){
			fout.write(ch[i]);
		}
		fout.close();	//will save the content in file after this line
	}
}
