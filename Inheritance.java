import java.io.*;
import java.util.*;
class Employee
{
	int i,s;
	String n;
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		n =sc.nextLine();
		System.out.println("ID");
		i = sc.nextInt();
		System.out.println("Salary with advance");
		s = sc.nextInt();
	}
}
class Calculate extends Employee
{
	void disp()
	{
		System.out.println("Name: "+n);
		System.out.println("ID: "+i);
		int adv = 2000;
		System.out.println("Advance: "+adv);
		s=s-adv;
		System.out.println("Salary: "+s);
	}
}
class Company
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		restart:while(true)
		{
		Calculate c = new Calculate();
		c.get();
		c.disp();
		System.out.println("Continue.. ???");
		System.out.println("Press 1 to Yes");
		System.out.println("Press 2 to Close");
		int x = sc.nextInt();
		if(x==1)
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