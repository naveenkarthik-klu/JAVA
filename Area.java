interface Figure
{
double pi=3.14;
float r = 3;
double area();
//double volume();
}
class Circle implements Figure
{
public double area()
{
return pi*r*r;
}
}
class Rectangle implements Figure
{
int a=2,b=3,c=4;
public double area()
{
return a*b;
}
public double volume()
{
return a*b*c;
}
}
class Triangle implements Figure
{
float b=5,h=7;
public double area()
{
return (0.5*b*h);
}

}
class Area 
{
public static void main(String args[])
{
Circle c = new Circle();
Rectangle r = new Rectangle();
Triangle t = new Triangle();
Figure f;
f=c;

System.out.println("Area of circle "+f.area());
f=r;
System.out.println("Area of rectangle "+f.area());
System.out.println("Volume of rectangle "+r.volume());
f=t;
System.out.println("Area of triangle "+f.area()); 
}
}