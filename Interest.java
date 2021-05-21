class Interest
{
	public static void main(String args[])
	{
	int p,n,r;
	float si,ci;
	p=1000;
	n=2;
	r=10;
	si=(p*n*r)/100;
	
	ci=p*(1+(r/100))^n-p;
	System.out.println(" P is "+p+" n is "+n+" r is "+r);
	System.out.println("Simple Interest = "+si);
	System.out.println("Compound Interest = "+si);
	}
}
