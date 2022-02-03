import java.util.*;
//value get shift if we add through add with index 
//set will remove prevous element and set no provided
public class Arraylist_eg
{
	public static void main(String eg[])
	{
		ArrayList l1 = new ArrayList(4);
		l1.add("Sujit");
		l1.add("Rahul");
		Iterator it = l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}