import java.io.*;
import java.util.*;
class matrix
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		restart2:while(true)
		{	
		restart:while(true)
		{	
		System.out.println("Enter number of rows and columns");
		System.out.println("Number of rows of 1st matrix-");
		int m = sc.nextInt();
		System.out.println("Number of columns of 1st matrix-");
		int n = sc.nextInt();
		System.out.println("Number of rows of 2nd matrix-");
		int p = sc.nextInt();
		System.out.println("Number of columns of 2nd matrix-");
		int q = sc.nextInt();
		int a[][] = new int [m][n];
		int b[][] = new int [p][q];
		int c[][] = new int [p][q];
		if(m==q)
		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.println("Enter the value of a["+i+"]["+j+"]");
					a[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<q;j++)
				{
					System.out.println("Enter the value of b["+i+"]["+j+"]");
					b[i][j] = sc.nextInt();
		        }
			}
         	for(int i=0;i<m;i++)
            {
				for(int j=0;j<q;j++)
				{
					c[i][j]=0;
					for(int k=0;k<n;k++)
					{
						c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
					}
				}
			}
            for(int i=0;i<p;i++)
            {
				for(int j=0;j<q;j++)
				{
					System.out.println("Answer "+c[i][j]);
				}
			}
			break restart;
		}
        else
        {
			System.out.println("Enter equal number of rows and columns");continue restart;
		} 	
        }
        System.out.println("Press 1 to Continue");
        System.out.println("Press 2 to Exit");
        int x = sc.nextInt();
		if(x==1)
        {
			continue restart2;
		}
        else
        {
			break restart2;
		}  	
        }
	}  		
}