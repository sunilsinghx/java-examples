package pack1;
import pack2.Student;
public class Example
{
	public static void main(String []args)
	{
		Student s1 = new Student();
		s1.setRollno(101);
		s1.setName("Sunil");
		System.out.println("Rollno is :"+s1.getRollno());
		System.out.println("Name is :"+s1.getName());
	}
}