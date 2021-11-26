//final keyword
//while using final it will keep the variable "blank"
//unlike while initalising it would initalize to 0 but using finaal it will be blank
//while using final in class it cannot override 
/*
--------------------------------------------------------------------
class Dummy
{
	public final void fun()	//final keyword is used
	{
	}
}
class MoreDummy extends Dummy
{
	public void fun()
	{}//will give error
}
-----------------------------------------------------------------------------------------*/
public class Finalkeyword
{
	private final int x;	//final instance member 
	private static final int y;	//final static memer variable
	static
	{
		y = 5;
	}
	Finalkeyword()	//constuctor
	{
		x = 7;
	}
	public static void main(String []arg){
	Finalkeyword e1 = new Finalkeyword();
}
	
}