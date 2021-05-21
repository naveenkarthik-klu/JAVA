class Fib
{
	public static void main(String args[])
	{
		int n1,n2,n3,n;
		n=10;n1=0;n2=1;
		System.out.println("Fibonacci series");
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0;i<n-2;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}	
	}
}
