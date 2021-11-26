public class SumCmd
{	
	//Program sum the cmd line args which is given in numeric and sum is displayed
	public static void main(String []args)
	{
		int s=0;
		for(int i =0; i<args.length; i++)
		{
			//type casting cmd argument to int and adding it
			s = s  + Integer.parseInt(args[i]);
		}
		System.out.println("Sum is "+s);
	}
}