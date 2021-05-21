class MatSum
{
	static int m = 3;
	static int n = 3;
	static void rsum(int a[][])
	{
		int i,j,s=0;
		for(i=0;i<3;++i)
		{
			for(j=0;j<3;++j)
			{
				s=s+a[i][j];
			}
			System.out.println("Sum of row "+i+" = "+s);
			s=0;
		}
		
	}
	static void csum(int a[][])
	{
		int i,j,s=0;
		for(i=0;i<3;++i)
		{
			for(j=0;j<3;++j)
			{
				s=s+a[j][i];
			}
			System.out.println("Sum of column "+i+" = "+s);
			s=0;
		}
		
	}
	public static void main(String args[])
	{
		int i,j;
		int a[][] = new int[m][n];
		int x=1;
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=x++;
		System.out.println("Given matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

		rsum(a);
		csum(a);
		int t = 0;
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				if(i==j)
					t=t+a[i][j];
		System.out.println("\nTrace of matrix = "+t);	
	}
		
}