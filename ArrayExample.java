//array in java
//taking 5 number from input and displaying it
import java.util.*;
class ArrayExample{
	public static void main(String []args)
	{
		int []arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		for (int i =0;  i<5; i++)
			arr[i] = sc.nextInt();

		for(int i=0; i<5; i++)
			System.out.println("Array element "+(i+1)+":"+arr[i]);
			//System.out.println("arr["+i+"]="+arr[i]);
	}
}