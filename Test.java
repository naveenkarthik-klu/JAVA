import java.io.*;
import java.util.*;

class Test
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Ten");
		System.out.println("2.Twenty");
		System.out.println("3.Thirty");
		restart:while(true)
		{
		System.out.println("Enter Your CHoice");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Ten");
				break restart;
			case 2:
				System.out.println("Twenty");
				break restart;
			case 3:
				System.out.println("Thirty");
				break restart;
			default:
				System.out.println("select Valid Choice");
				continue restart;
		}
		}
	}
}