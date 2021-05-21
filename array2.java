import java.io.*;
import java.util.*;
class array2
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
        int b[] = new int[5];
        for(int i=0;i<5;i++)
        {
			System.out.println("Enter the value of b["+i+"]");
			b[i] = sc.nextInt();
		}     		
		int c[] = new int[5];
        for(int i=0;i<5;i++)
        {
			c[i]=a[i]+b[i];
			
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Answer c["+i+"] "+c[i]);
		}
	}
}