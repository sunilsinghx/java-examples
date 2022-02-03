//use of comparator
//we use compartor if we have to specify which constraint to take 
//comparable is interface used if default sorting to be followed eg (if integer,String class which impement this)
//comparator is interface used we want to define our own storing mechanism
//we have to declare compare method

import java.util.*;
class Book
{
	private String title;
	private double price;
	public Book(String title,double price)	//constuctor for initializing
	{
		this.title = title;
		this.price = price;
	}
	public String getTitle()
	{
		return(title);
	}
	public double getPrice()
	{
		return(price);
	}
}
class MyCompartor implements Comparator
{
	//o2 is which is to be inserted and get compared with o1
	//o1 which is already inserted 
	public int compare(Object o1, Object o2)
	{
		Book book1 = (Book)o1;	//storing object type o1 typecasting into book type into book1
		Book book2 = (Book)o2;
		if(book1.getPrice() < book2.getPrice())	
			return (-1);	//if book1(we want to enter) is less than book2 move in left
		else
			return (1);	//move in right
	}
}
class Comaprator_eg
{
	public static void main(String args[])
	{
		Book b1,b2,b3;
		b1 = new Book("PHP",300.00);
		b2 = new Book("Java",500.00);
		b3 = new Book("C",400.00);
		TreeSet t = new TreeSet(new MyCompartor());	//as it had implemented interface comparator
		t.add(b1);
		t.add(b2);
		t.add(b3);
		Book b;
		Iterator it = t.iterator();	//used to iterate (which is now pointed to b1)
		while(it.hasNext())
		{
			b = (Book)it.next();	
			System.out.println(b.getTitle()+ " "+ b.getPrice());
		}
	}
}