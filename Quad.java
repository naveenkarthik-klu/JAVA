import java.util.Scanner;
class Quad
{
	public static void main(String args[])
	{
		int a,b,c;
		double x,y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter values of a,b and c");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		int k = (b*b)-(4*a*c);
		if(k<0)
		{
			System.out.println("No real roots");
		}
		else
		{
			//double l = Math.sqrt(k);
			x=(-b-1)/2*a;
			y=(-b+1)/2*a;
			System.out.println("The roots are "+x +y);
		}
	}
}