import java.io.*;
import java.util.*;
class addsub
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		restart2:while(true)
		{	
		restart:while(true)
		{	
		int num1,num2,ans;
		System.out.println("Enter your choice...");
		System.out.println("Press 1 Add");
		System.out.println("Press 2 Subtract");
		int c = sc.nextInt();
		switch(c)
		{
			case 1:System.out.println("Enter two numbers");
			System.out.println("number1-");
			num1 = sc.nextInt();
			System.out.println("number2-");
			num2 = sc.nextInt();
			ans = num1+num2;
			System.out.println("Answer "+ans);break restart;
			case 2:System.out.println("Enter two numbers");
			System.out.println("number1-");
			num1 = sc.nextInt();
			System.out.println("number2-");
			num2 = sc.nextInt();
			ans = num1-num2;
			System.out.println("Answer "+ans);break restart;
			default:System.out.println("Enter valid choice");continue restart;
		}
		}
		System.out.println("Press 1 to Continue");
		System.out.println("Press 2 to Exit");
		int d = sc.nextInt();
		if(d==1)
		{
			continue restart2;
		}
		else
		{
			break restart2;
		}
		}
	}
}