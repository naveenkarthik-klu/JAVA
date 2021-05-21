class Max
{
	public static void main(String args[])
	{
		int a[]={64, 34, 25, 12, 22, 11, 90};
		int i,j,t;
		int n=a.length;
		System.out.println("Given array of elements");
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
		System.out.println("\nThe second maximum number int the array is "+a[1]);	
		System.out.println("The third maximum number int the array is "+a[2]);
	}
}