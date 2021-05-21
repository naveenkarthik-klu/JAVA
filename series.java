import java.io.*;
import java.util.*;
class series
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int x1=-1;
		int x2=1;
		int x3,n;
		System.out.println("Enter the number of turns ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			x3=x1+x2;
			System.out.println(+x3+" ");
			x1=x2;
			x2=x3;
		}
	}
}