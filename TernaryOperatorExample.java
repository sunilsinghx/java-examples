public class TernaryOperatorExample
{
	public static void main(String []args)
	{
		int x,y;
		x = 20;
		y = (x==1)?61:90;
		int res = (x>y?x:y);
		System.out.println("Value of Y: "+y);
		System.out.println("The greater variable is "+(x>y?x:y)+ "and value is "+res);
	}
}