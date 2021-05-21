import java.io.*;
import java.util.*;
class Fact2
{
	public static void main(String arg[]) 
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1,f=1;
		System.out.println("Enter a number...");
		n=sc.nextInt();
		while(i<=n)
		{
			f=f*i;
			i++;
		 }   
			System.out.println("The factorial of "+n+" is "+f);			
		
	}
}