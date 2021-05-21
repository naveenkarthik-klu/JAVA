import java.io.*;
import java.util.*;
public interface inter
{
	int a,b,c;
}
class interface2 implements inter 
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st num");
		a=sc.nextInt();
		System.out.println("Enter 2nd num");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Answer: "+c);
	}
}