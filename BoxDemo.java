class Box2
{
long l,h,d;
Box2()
{
l=3;h=4;d=2;
}
Box2(long len,long bre,long hei)
{
l=len;
h=bre;
d=hei;
}
long volume()
{
return l*h*d;
}
}
class BoxDemo
{
public static void main(String args[])
{
Box2 b1 = new Box2();
Box2 b2 = new Box2(3,6,9);
long v;
v=b1.volume();
System.out.println("Volume is "+v);
v=b2.volume();
System.out.println("Volume is "+v);
}
}