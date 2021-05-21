import java.io.*;
import java.util.*;
class ExcepTest
{
	public static void main(String ar[]) throws IOException
	{
		int b=11,c,a=0;
		System.out.println("Given numbers "+b+" "+a);
		try 
		{
			c=b/a;
			System.out.println(c);
		}
		
		catch(ArithmeticException e2)
		{
			System.out.println("Arithmetic Exception");
		}
		
	}
}