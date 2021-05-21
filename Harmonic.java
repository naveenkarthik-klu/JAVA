import java.lang.Math;
class Harmonic
{
	static double x;
	static double fsum(int n)
	{
		double s = 0.0;
		int i;
		for(i=1;i<=n;i++)
		{
			s+=(double)(1.0/i);
		}
		return s;
	}
	static double lsum(int n)
	{
		double s = 0.0;
		int i;
		for(i=n;i>=1;i--)
		{
			s+=(double)(1.0/i);
		}
		return s;
	}
	public static void main(String args[])
	{
		int n = 5000;
		System.out.println("Sum of harmonic series from left to right : "+fsum(n));
		System.out.println("Sum of harmonic series from right to left : "+lsum(n));
		 x = fsum(n)-lsum(n);
		System.out.println("Absolute difference is "+Math.abs(x));
	}
}