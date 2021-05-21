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
class M2
{
	public static void main(String arg[])
	{
		B ob = new B();
		ob.run();
	}
}	
		
	
