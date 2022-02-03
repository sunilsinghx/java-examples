import java.util.*;
//it sort object in logical order
//doesnt store duplicate value
//element order is not preserved I/O(A ,C ,D,B) O/P(A,B,C,D)
class HashSet_eg
{
	public static void main(String []args)
	{
		HashSet h = new HashSet();
		h.add("A");
		h.add("D");
		h.add("B");
		h.add("C");
		System.out.println(h);	//will print A B C D
		
	}
}