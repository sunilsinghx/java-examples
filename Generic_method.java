//generic methods
public class  Generic_method
{
	public <E> void printArr(E s[])	//we can pass integer array aswell string array
	{
		//for rxach loop
		for(E x:s)
		{
			System.out.println(x);
		}
	}
	public static void main(String arhsp[])
	{
		Generic_method e1 = new Generic_method(); 
		String countries[] = new String[]{"India","Nepla","USA","Bhutan"};			Integer number[] ={12,34,123,45,22,66,33};
		e1.printArr(countries);
		e1.printArr(number);
	}
}
	