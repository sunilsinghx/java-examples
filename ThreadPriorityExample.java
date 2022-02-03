class Ex1 extends Thread
{
 public void run(){
  for(int i=0;i<5;i++)
   System.out.println("Thread 1: "+i);
 }
 
}
class Ex2 extends Thread
{
 public void run(){
  for(int i=0;i<5;i++)
   System.out.println("Thread 2: "+i);
 }
}
public class ThreadPriorityExample {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
 Ex1 t1 = new Ex1();
Ex2 t2 = new Ex2();
  int i1,i2;
  i1=t1.getPriority();
  i2=t2.getPriority();
  
  System.out.println("thread 1 priority= "+i1);
  System.out.println("thread 2 priority= "+i2);
  t1.setPriority(2);
  t2.setPriority(9);
  i1=t1.getPriority();
  i2=t2.getPriority();
  System.out.println("thread 1 priority after= "+i1);
  System.out.println("thread 2 priority after= "+i2);

  t1.start();
  t2.start();
  
  
   }
}