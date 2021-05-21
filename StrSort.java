import java.util.*;
class StrSort
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		String s1,s2,s3;
		System.out.println("Enter three string");
		s1=s.nextLine();
		s2=s.nextLine();
		s3=s.nextLine();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);
		System.out.println(al);
	}
}