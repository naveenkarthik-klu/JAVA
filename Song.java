import java.util.*;
class Song
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of men");
		int n = s.nextInt();
		String s1 = "men to went mow,went to mow a meadow";
		String s2 = "1 man and his dog wet to mew a meadow";
		String s3 = " men, ";
		System.out.print("1 man went to mow,went to mow a meadow\n1 man and his dog wet to mew a meadow");
		int i,j=1;
		System.out.println();
		i=2;
			System.out.print(i+" "+s1+"\n");
			System.out.print(i+" men, "+s2+"\n");
			
		
		
		for(i=3;i<=n;i++)
			{
				System.out.print(i+" "+s1+"\n");
				System.out.print(i+s3+(i+1)+s3+s2+"\n");
		}
	}
}