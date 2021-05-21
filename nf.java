import java.io.*;
import java.util.*;
class nf1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int f = 1,i;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial: "+f);
	}
}