import java.util.*;
class BBReadLines2
{
	public static void main(String ar[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lines of text");
		System.out.println("Enter 'stop' to quit");
		String s;
		do
		{
			s = sc.next();
			System.out.println("Given line : "+"'"+s+"'");
			
		}while(!s.equals("stop"));
    }
}