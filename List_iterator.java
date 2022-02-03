//listIterator 
//can go bi direction 
import java.util.*;

class List_iterator
{
	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.add("C");
		l1.add("Go");
		l1.add("Java");
		l1.add("PHP");
		l1.add("CPP");
		System.out.println(l1);

		ListIterator lit = l1.listIterator();
		while(lit.hasNext())
		{
			String s =(String)lit.next();
			
			if(s.equals("Java"))
				lit.set("Java SE");
			else if(s.equals("C"))
				lit.add("DS");
			else if(s.equals("PHP"))
				lit.remove();
		}
		System.out.println(l1);
	}
}
	