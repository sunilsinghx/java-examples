//linked list program

import java.util.*;

class Linked_eg
{
	public static void main(String []ars)
	{
		LinkedList list = new LinkedList();	//new linkedlist object
		list.addFirst("Marcon");	//add first to linked list
		list.addLast("Tueqw");
		list.addLast("Emma");	//add last to linked list
		list.add("Samuel");		//adds to linked list
	//Macron->Samuel->Emma
	System.out.println(list);
	System.out.println(list.getFirst());	//get first node
	System.out.println(list.get(1));	//print node at 1 postion
	System.out.println(list.getLast());	//print last node 
	}
}