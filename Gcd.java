class Gcd
{
static int gcd(int a,int b)
{
	if(a==0)
		return b;
	if(b==0)
		return a;
	if(a>b)
		return (gcd(a-b,b));
	return (gcd(a,b-a));
}
public static void main(String args[])
{
int p=25,q=100;
int g=gcd(p,q);
System.out.println("GCD of "+p+" and "+q+" is "+g);
}
}
