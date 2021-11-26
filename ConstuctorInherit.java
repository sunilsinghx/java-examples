//constuctor in inheritance
//After creating object of B , A constuctor get called first 
//then of B
class A{
	int a;
	public A()
	{
		System.out.println("A's constuctor got called ");
	}
}
class B extends A{
	int b;
	public B(){
	System.out.println("B's constuctor got called ");
	}
}
class ConstuctorInherit
{
	public static void main(String[] args)
	{
		B obj= new B();
	}
}
