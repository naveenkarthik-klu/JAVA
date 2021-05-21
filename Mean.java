class Mean
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		int n = a.length,i;
		double s=0,dv=0,r;
		for(i=0;i<n;i++)
		{
			s=s+a[i];
		}
		double m;
		m=s/n;
		System.out.println("Given numbers");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nMean = "+m);
		for(i=0;i<n;i++)
		{
			dv+=Math.pow(a[i]-m,2);
		}
		r=Math.sqrt(dv/n);
		System.out.println("Standard Deviation = "+r);
	}
}