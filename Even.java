import java.util.Scanner; 
class Even
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println("Given string : "+s);
		System.out.println("Elements in even position");
		for(int i=0;i<s.length();i++)
		{
			if((i%2-1)==0)
			{
				
				System.out.print(s.charAt(i)+" ");
			}
		}
		
	}
}