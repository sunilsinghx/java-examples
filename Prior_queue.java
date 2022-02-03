//program for priority Queue
import java.util.*;

class Prior_queue
{
	public static void main(String []args)
	{
		PriorityQueue pq= new PriorityQueue();
		pq.offer("A");
		pq.offer("C");	//we can use pq.add() also to add
		pq.offer("D");
		pq.offer("B");
		System.out.println(pq);
		System.out.println(pq.poll());	//will pop FIFO
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());	// will output  A B C D
		//poping is done in storted order
	}
}	