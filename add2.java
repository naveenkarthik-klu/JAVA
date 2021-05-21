import java.io.*;
import java.util.*;
class add2
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i=0,s=0;
		while(i<=n)
		{
		s=s+i;
		i++;
		}
		System.out.println("Sum is "+s);
	}
}
