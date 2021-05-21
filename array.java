import java.io.*;
import java.util.*;
class array
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
        for(int i=0;i<5;i++)
		{
			System.out.println("Enter the value of a["+i+"]");
			a[i] = sc.nextInt();
		}			
		for(int i=0;i<5;i++)
		{
			System.out.println("a["+i+"] "+a[i]);
		}
	}
}