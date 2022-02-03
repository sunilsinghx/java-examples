//cursor
//it help to acces different object elements

//enumeration help to acesess element

import java.util.*;

public class Enum_eg
{
	public static void main(String[] arg)
	{
		Vector v = new Vector();
		v.addElement("One");
		v.addElement("Two");
		v.addElement("Three");
		System.out.println(v);	//print all element in vector

	Enumeration e  = v.elements();	//v.elements return object which has implemented Enumeration interface 
	while(e.hasMoreElements())
	{
		String s = (String)e.nextElement();	//.nextElement return object type so it typecasted
		System.out.println(s +" "+s.length());
	}

	}
}
	