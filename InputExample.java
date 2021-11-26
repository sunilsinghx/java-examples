//takong input from keyboard
import java.util.*;	//contain Scanner class which is responsible for taking info from buffer
class InputExample
{
	public static void main(String []args){
	
	System.out.println("Enter Your Name and Age: ");
	Scanner sc = new Scanner(System.in);	//sc is new object of Scanner where system.in is pass(is responsible for taking input from keyboard)
	String name = sc.next();
	int age = sc.nextInt();	//nextInt convert buffer value in int

	System.out.println("Name: "+name+" Age: "+age);
}


}