import java.util.Scanner;
class Deficient
{
	static int diviSum(int n)
	{
	int s = 0;
	for(int i=1;i<=(Math.sqrt(n));i++)
	{
		if(n%i==0)
		{
			if((n/i)==i)
			{
				s=s+i;
				
			}	
			else
			{
				s=s+i;
				s=s+(n/i);
			}
		}	
	}
	return s;
	}
	static boolean isDefi(int n)
	{
		return (diviSum(n)<(2*n));
	}
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		if(isDefi(n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}