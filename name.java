import java.io.*;
import java.util.*;
class name
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		String a[] = new String[5];
        int n = 1;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter name"+n);
			a[i] = sc.nextLine();
			n++;
		}	
        for(int i=0;i<5;i++)
		{
			n=1;
			System.out.println("Name "+n+": "+a[i]);
			n++;
		}
	}
}