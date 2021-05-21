import java.util.Scanner;
import java.io.*;
class EBbill
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cn;
		String name,type;
		double pr,cr;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter consumer number");
		cn=s.nextInt();
		System.out.println("Enter name");
		name=br.readLine();
		
		System.out.println("Enter type Domestic or Commercial ?");
		type=br.readLine();
		System.out.println("Enter previous month and current month reading");
		pr=s.nextDouble();
		cr=s.nextDouble();
		double r = cr - pr;
		
		
		String s1 = "Domestic";
		String s2 = "Commercial";
		if(type.equals(s1))
		{
			double a=0.0;
			if(r<=100)
				a=r*1;
			if(r>=101&&r<=200)
				a=r*2.5;
			if(r>=201&&r<=500)
				a=r*4;
			if(r>500)
				a=r*6;
			System.out.println("Amount to be paid : "+a);
		}
		if(type.equals(s2))
		{
			double a=0.0;
			if(r<=100)
				a=r*2;
			if(r>=101&&r<=200)
				a=r*4.5;
			if(r>=201&&r<=500)
				a=r*6;
			if(r>500)
				a=r*7;
			System.out.println("Amount to be paid : "+a);
		}
	}
}