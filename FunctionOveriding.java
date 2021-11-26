//function overiding example
//two class have same function with same (one parameter) 
class A
{
	public void f1(int x)
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	public void f1(int x)
	{
		System.out.println("Class B");
	}
}

public class FunctionOveriding
{
	public static void main(String[] args)
	{
		B obj=  new B();
 //creating an object of B it will be only be 
//called of class B and not of parent class A 
		obj.f1(4);	
	}
}