//Getting more info about class created by 'Class' class
//in short get more information about class we created or already there

import java.util.Date;
public class InfoClass
{
	public static void main(String args[])
	{
		InfoClass d1 = new InfoClass();	// creating new object 
		System.out.println("Class name: "+ d1.getClass());	//will display InfoClass
		Date today = new Date();
		System.out.println("Today : "+today);
		Class cls = today.getClass();	//today is date class object and will return java.util.date class
		System.out.println("cls : "+cls); 
		System.out.println("Class name : "+cls.getName());
		System.out.println("Package name: "+cls.getPackage());	//will display in which package is this class
		System.out.println("InfoClass Super class : "+cls.getSuperclass());	//will display java.lang.object 
		
		Class cArray[] = cls.getInterfaces();
		for(Class c : cArray)
		{
			System.out.println("InfoClass super interface : "+ c);
		}
		System.out.println("InfoClass Class loader : "+cls.getClassLoader());
		System.out.println("Is InfoClass interface? : "+cls.isInterface());
	}
}       