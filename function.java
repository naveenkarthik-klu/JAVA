import java.io.*;
import java.util.*;
class function
{
	int x;
	float c,s,t;
	int area(int x)
	{
		System.out.println("Square ");
		return x*x;
	}
	double area(double c)
	{
		System.out.println("Circle ");
		return 3.14 * c * c;
	}
	double area(double s,double t)
	{
		System.out.println("Triangle ");
		return 0.5 * s * t;
	}
}
class area extends function
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		restart:while(true)
		{
		System.out.println("Enter side of square");
		int a = sc.nextInt();
		System.out.println("Enter radius of circle");
		float r = sc.nextFloat();
		System.out.println("Triangle");
		System.out.println("Base-");
		float b = sc.nextFloat();
		System.out.println("Height-");
		float h = sc.nextFloat();
		function f = new function();
		int area1 = f.area(a);
		double area2 = f.area(r);
		double area3 = f.area(b,h);
		System.out.println("Area of square is "+area1);
		System.out.println("Area of circle is "+area2);
		System.out.println("Area of triangle is "+area3);
		System.out.println("Press 1 to Exit");
		System.out.println("Press 2 to Continue");
		int i = sc.nextInt();
		if(i==2)
		{
			continue restart;
		}
		else
		{
			break restart;
		}
		}		
	}
}