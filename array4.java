import java.io.*;
import java.util.*;
class array4
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter value of a["+i+"]["+j+"]");
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter value of b["+i+"]["+j+"]");
				b[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
		        c[i][j]=a[i][j]+b[i][j]; 
				
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("Answer c["+i+"]["+j+"] "+c[i][j]);
				
			}
		}
	}
}