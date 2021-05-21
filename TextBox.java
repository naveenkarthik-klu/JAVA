class Box
{
	float l,b,h;
	float volume()
	{
		float v=l*b*h;
		return v;
	}

void set(float len,float bre,float hei)
{
l=len;
b=bre;
h=hei;
}
}

public class TextBox
{
public static void main(String args[])
{


Box b=new Box();
b.set((float)5.5,(float)7.6,(float)8.7);
double v=b.volume();
System.out.println("Volume : "+v);
}
}