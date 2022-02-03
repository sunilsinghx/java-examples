//hashmap example
//it store key value pair
//we can keep null but just one
//doesnt repeat key

import java.util.*;

class Hashmap_eg
{
	public static void main(String []ashj)
	{
		HashMap h = new HashMap();
		h.put(null,null);
		h.put(1,"Sujit");
		h.put(null,null);
		h.put(2,"Paras");
		h.put(3,"Atharva");
		System.out.println(h);
	}
}