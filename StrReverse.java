import java.util.*;
class StrReverse
{
	public static void main(String ar[])
	{
		Scanner s = new Scanner(System.in);
		String s1;
		System.out.println("Enter a string");
		s1=s.nextLine();
		//char c[] = s1.toCharArray();
		for(int i=(s1.length()-1);i>=0;i--)
		{
			//System.out.print(" "+c[i]);
			System.out.print(s1.charAt(i)+" ");
		}
	}
}