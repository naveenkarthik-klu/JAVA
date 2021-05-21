import java.io.*;
import java.util.*;
class A
{
	void run()
	{
		System.out.println("Run in A");
	}
}
	class B extends A
	{
		void run()
		{
			System.out.println("Run in B");
		}
	}
class M1
{
	public static void main(String arg[])
	{
		A ob = new A();
		ob.run();
	}
}	
		
	
