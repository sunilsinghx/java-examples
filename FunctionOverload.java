//function overloading example
class A
{
	public void f1(int x)
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	public void f1(int x,int y)
	{
		System.out.println("Class B");
	}
}

public class FunctionOverload
{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.f1(4);	//same function with one argument
		obj.f1(34,23); //same obj with 2 args
	}
}