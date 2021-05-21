class Facto
{
	
	int fact(int x)
	{
		int f,i;
		f=1;
		for(i=1;i<=x;i++)
		{
			f=f*i;
		}
		return f;
	}
}
class Compute
{
	public static void main(String args[])
	{
		int n,r,ncr,npr;
		n=5;r=2;
		Facto f = new Facto();
		ncr=f.fact(n)/(f.fact(r)*f.fact(n-r));
		npr=f.fact(n)/f.fact(n-r);
		System.out.println("n is "+n);
		System.out.println("r is "+r);
		System.out.println("nCr = "+ncr);
		System.out.println("nPr = "+npr);
	}
}