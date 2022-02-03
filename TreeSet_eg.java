import java.util.*;
//it sort object in logical order
//doesnt store duplicate value
//element order is preserved I/O(A ,C ,D,B) O/P(A,B,C,D)
class TreeSet_eg
{
	public static void main(String []args)
	{
		TreeSet h = new TreeSet();
		h.add("A");
		h.add("D");
		h.add("B");
		h.add("C");
		System.out.println(h);	//will print A B C D
		System.out.println(h.headSet("C"));	//return A B(previous two object)
		System.out.println(h.tailSet("C"));	//return C D(next two object including self)
		System.out.println(h.subSet("B","D"));	//return B C(include B ,C exclude D)
	}
}