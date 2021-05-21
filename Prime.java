class Prime
{
	
	static void test(int a,int b)
	{
		int i,f;
		while(a<=b)
		{
			f=0;
			for(i=2;i<=a/2;i++)
			{
				if(a%i==0)
				{
					f=1;
					break;
				}
			}	
			if(f==0)
				System.out.println(a+" ");
			a++;
		}	
	}
	public static void main(String args[])
	{
		int m=10,n=30;
		System.out.println("Given two number are "+m+" "+n);
		System.out.println("Prime numbers between given two numbers");
		test(m,n);
	}
}