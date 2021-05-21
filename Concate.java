import java.util.Scanner;
class Concate
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter a string");
		s1=sc.nextLine();
		System.out.println("Enter number of times to print the given string");
		int n = sc.nextInt();
		s2=s1;
		for(int i=1;i<n;i++)
		{
			s1=s1+s2;
			System.out.println(s1);
			
		}
		
	}
}