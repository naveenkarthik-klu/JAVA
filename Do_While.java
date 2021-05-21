import java.io.*;
import java.util.*;
class Do_While
{
	public static void main(String arg[]) 
	{
		Scanner sc = new Scanner(System.in);
		int i=1;
		System.out.println("Enter name ");
		String name = sc.nextLine();
		System.out.println("Enter the number of turns");
		int n = sc.nextInt();
		do
		{
			System.out.println("no. "+i+name);
			i++;
		}
		while(i<=n);
	}
}