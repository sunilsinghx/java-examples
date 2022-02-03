//using equals function 

public class Equals
{
	public static void main(String[] args)
	{
		String s1 = new String("John");
		String s2  =new String("John");	//two object with  same content but different memory
		String s3  = s1 	//s1 and s3 is pointing to same object 
		System.out.println("s1 == s2 : "+(s1 == s2));	//check if both pointing to same object
		System.out.println("s1.equals(s2) : "+s1.equals(s2));		//will check if s1 and s2 content are same
		System.out.println("s1 == s3 : "+ (s1 == s3));	//check if both pointing to same object
		System.out.println("s1.equals(s3): "+s1.equals(s3));	//will check if s1 and s3 content are same
	}
}