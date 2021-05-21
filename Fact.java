import java.io.*;
import java.util.*;
class Fact
{
	public static void main(String arg[]) 
	{
		Scanner sc = new Scanner(System.in);
		int n,f=1;
		System.out.println("Enter a number...");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		 }   
			System.out.println("The factorial of "+n+" is "+f);			
		
	}
}