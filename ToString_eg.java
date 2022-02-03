//ToString to dispaly object content without explicitly creating display method
//creating toString method jvm will execute it automatically when we class object
//if not declared will show hash code of object

class Student
{
	String name;
	String city;
	int rollno;
	Student(String name,int rollno, String city)	//initialize and store in instance variable
	{
		this.rollno = rollno;
		this.city = city;
		this.name = name;
	}
	public String toString()
	{
		return (name+"\t"+rollno+"\t"+city);
	}
}
class ToString_eg
{

	public static void main(String args[])
	{
		Student s1= new Student("Sunil",4212,"Talegaon Dabhade");
		Student s2 = new Student("Paras",2332,"Kothrud");
		System.out.println("Name\trollno\tcity\n");
		System.out.println(s1);
		System.out.println(s2);
	}
}

	