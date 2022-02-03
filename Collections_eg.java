//collections example
//its different from collection(interface) collections(class)
//contain abstract methods we can use for storting, etc 

import java.util.*;
class Collections_eg
{
	public static void main(String []args)
	{	
		Vector v = new Vector();
		v.add(20);
		v.add(10);
		v.add(40);
		v.add(30);
		v.add(50);
		System.out.println("Vector ="+v);
		Collections.sort(v);	
		int x = Collections.binarySearch(v,30);
		System.out.println("vector = "+v+"30 position x = "+x);
		System.out.println("Before Swap: "+v);
		Collections.swap(v,1,3);
		System.out.println("After Swap: "+v);
		
	}
}