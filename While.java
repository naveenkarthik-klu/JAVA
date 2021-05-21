import java.io.*;
import java.util.*;
class While
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name...");
		String name=sc.nextLine();
		System.out.println("Enter the number of turns");
		int n = sc.nextInt();
		
		int i=1;
		while(i<=n)
		{
			System.out.println("no "+i+": "+name);
			i++;
		}
	}
}
  