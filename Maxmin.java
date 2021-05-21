class Maxmin
{
	public static void main(String args[])
	{
		int a[]={64, 34, 90, 12, 22, 11, 25};
		int i,j,t;
		int n=a.length;
		System.out.println("Given list of integers");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		for (i = 0; i < n-1; i++)
			for (j = 0; j < n-i-1; j++)
				if (a[j] < a[j+1])
				{
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}	
	System.out.println("\nThe smallest number is "+a[n-1]);	
	System.out.println("The largest number is "+a[0]);
			
	}
}