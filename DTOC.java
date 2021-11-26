//default throw our catch
class DTOC
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(3/0); 	//exception will occur and will be catch by our catch methon
			System.out.println("In try"); //it will not print coz prevous line was triggered as exception
		}
	catch(NullPointerException e)	//it will get ignored will check nexr catch if it would'nt find relavent catch default java catch will occur
	{	
		System.out.println("EXception :"+e.getMessage());
	}
	catch(ArithmeticException e)		//exception type and its ref variable
	{
		System.out.println("Exception :"+e.getMessage());
	}
	System.out.println("this line is printed after exception ");	//using try catch program do not get terminate abdrutly
	}
}