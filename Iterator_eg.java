//cursor--> iterator 

import java.util.*;

public class Iterator_eg
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		for(int i= 1; i<=10; i++)
			a1.add(i);
		
		System.out.println(a1);
		Iterator it = a1.iterator();	

		while(it.hasNext())
		{
			Integer I =(Integer)it.next();
			if(I>3 && I<6)
				it.remove();
		}
		System.out.println(a1);
	}
}