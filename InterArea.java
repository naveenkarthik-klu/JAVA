import java.util.*;
 interface A
{
	double area();
}
 class Circle implements A
{
	double r;
	Circle(int a)
	{
		r=a;
	}
	double area()
	{
		return (3.142*r*r);
	}
}
 class InterArea
{
	public static void main(String arg[])
	{
		Circle c = new Circle(2);
		System.out.println("Area of circle is "+area());
	}
}