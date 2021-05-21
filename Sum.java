class Sum
{
	public static void main(String args[])
	{
		int sum,n;
		sum=0;n=35;
		int t = n;
		while(n!=0)
		{
			sum=sum+(n%10);
			n=n/10;
		}	
		System.out.println("Given number is "+t);
		System.out.println("Sum of the digits is "+sum);
	}
}