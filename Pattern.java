import java.io.*;
class Pattern
{
	static void printStar(int n) 
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	public static void main(String args[])
	{
		int n = 5;
		printStar(n);
	}
}