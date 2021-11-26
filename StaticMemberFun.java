//static member function inheritance

class Parent{
	public static void f1(){
	System.out.println("Hello");
	}
}
class Child extends Parent{
	public static void f1(){	//same method as parent
	System.out.println("YO man");
	}
}

public class StaticMemberFun{
	public static void main(String[] args)
	{
		Child.f1();	
		Parent.f1();
	}
}