import java.io.*;
import java.util.*;
class high2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of values ");
		int n=sc.nextInt();
		int i,max=0;
		int a[]=new int[10];
		System.out.println("Enter the values");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The highest value is "+max);
	}
}