class ChristmasTree
{
	public static void main(String args[])
	{
		int i,j,n=18;
		
		
		for(i=0;i<n;i++)
		{
			for(j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		i=0;j=0;n=18;
		for(i=8;i<n;i++)
		{
			for(j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
}