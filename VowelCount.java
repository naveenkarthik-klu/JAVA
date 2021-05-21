import java.util.*;
class VowelCount
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter a string");
		s=sc.nextLine();
		int n = s.length();
		int c = 0;
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				c++;
			}
		}
		System.out.println("Number of vowels in given string is "+c);
	}
}