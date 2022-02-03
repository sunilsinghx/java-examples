//Arrays 
//this arrays will have utils function like sort,fill etc

import java.util.*;
public class Arraysw_sort
{
	public static void main(String[] args)
	{
		int a[] = {20,5,50,10,25};
		int i;
		/*int a[] = new int[10];
		Arrays.fill(a,5);	//will keep all 10 elements as 5
		*/
		for(i =0; i< a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
		Arrays.sort(a);	//will sort array
		//Arrays.sort(a,2,5)	//will sort from index 2 to 5 (excluded ) only
		System.out.println("After sorting: ");
		for(i =0; i< a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}