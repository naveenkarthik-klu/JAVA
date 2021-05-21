import java.util.Scanner;
class License
{
	String name,addr,dob,mnum;
	void getdata()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");
		name=s.nextLine();		
		System.out.println("Enter Date of birth: ");
		dob=s.nextLine();		
		System.out.println("Enter address: ");
		addr=s.nextLine();		
		System.out.println("Enter mobile number: ");
		mnum=s.nextLine();		
		
	}
}
class Issue extends License
{
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Address: "+addr);
		System.out.println("DOB: "+dob);
		System.out.println("Mobile number: "+mnum);
	}
}
class LicenseApproval
{
	public static void main(String ar[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s.nextInt();
		
		Issue i = new Issue();
		if(age>18)
		{
			i.getdata();
			i.display();
			System.out.println("Your license have been approved");
		}
		else
		{
			System.out.println("Your age is less than 18");
		}
	}
}