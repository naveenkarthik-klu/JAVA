import java.io.*;
import java.util.*;
class func_overloading
{
	
	int add(int a,int b)       
	{
		return a+b;
	}
	int add(int x,int y,int z)
	{
		return x+y+z;
	}
}
	class main_class
	{
		public static void main(String arg[])
		{
			func_overloading f = new func_overloading();
			int d = f.add(5,4);
			int e = f.add(5,4,3);
			System.out.println("Answer1 "+d);
			System.out.println("Answer2 "+e);
			
						
		}		
	}
