import java.io.*;
import java.util.*;
class sorting
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j,t;
		System.out.println("Enter number of values");
        int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the values");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]<a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("\nAscending order:\n");
		for(i=0;i<n;i++)
		{
			System.out.println("\t"+a[i]);
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("\nDescending order:\n");
		for(i=0;i<n;i++)
		{
			System.out.println("\t"+a[i]);
		}
	}
}