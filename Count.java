import java.util.*;
import java.lang.*;
class Count
{
	public static void main(String ar[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = s.next();
		System.out.print("Given string :"+s1);
		int c = 0;
		System.out.println("\nEnter a letter to count");
		char s2 = s.next().charAt(0);
		for(int i=0;i<s1.length();i++)
		{
			if(s2==(s1.charAt(i)))
			{
				c=c+1;
			}
		}
		System.out.println("Number of occurrence of "+s2+" is "+c);
	}
}