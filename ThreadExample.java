//making thread with "extending Thread class"
class A extends Thread
{
	public void run(){
	for(int i=0; i< 5; i++){
	System.out.println("Thread A : "+i);
		}
	}
	
}
class B extends Thread
{
public void run(){

	for(int i =0; i<5;i++){
	System.out.println("Thread B :"+i);
	}
	}	
}
class ThreadExample
{
	public static void main(String []arg){
	A o1 = new A();	//creating an object of A which had extend Thread so we can access Thread functionality
	B o2 = new B();
	o1.start();
	o2.start();
	}
}
