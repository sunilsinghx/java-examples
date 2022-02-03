//Anonymous class example
class Greeting
{
	public void sayhello()
	{
		System.out.println("Hello ");
	}
}
class India
{
	//creating child class of Greeting with refrence variable of Greeting
	//as anonymonous class is always subclass
	Greeting g = new Greeting(){
	public void sayhello()
	{
		System.out.println("Hello there");
	}
	};
}
public class Anonymous_class
{
	public static void main(String args[])
	{
			India i = new India();
			i.g.sayhello();
			
	}
}