import java.io.*;
import java.util.*;
class gpa
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int gp1=0,gp2=0,gp3=0,gp4=0,gp5=0,gp6=0;
		System.out.println("\tGPA Calculation");
		System.out.println("Enter Marks");
		System.out.println("Course1");
		int c1 = sc.nextInt();
		System.out.println("Course2");
		int c2 = sc.nextInt();
		System.out.println("Course3");
		int c3 = sc.nextInt();
		System.out.println("Course4");
		int c4 = sc.nextInt();
		System.out.println("Course5");
		int c5 = sc.nextInt();
		System.out.println("Course6");
		int c6 = sc.nextInt();
		if(c1>=90&&c1<=100)
		{
			 gp1=10;
		}
		if(c1>=80&&c1<90)
		{
			 gp1=9;
		}
		if(c1>=70&&c1<80)
		{
			 gp1=8;
		}
		if(c1>=60&&c1<70)
		{
			 gp1=7;
		}
		if(c1>=50&&c1<60)
		{
			 gp1=6;
		}
		if(c1>=40&&c1<50)
		{
			 gp1=5;
		}if(c1<40)
		{
			 gp1=0;
		}
		if(c2>=90&&c2<=100)
		{
			 gp2=10;
		}
		if(c2>=80&&c2<90)
		{
			 gp2=9;
		}
		if(c2>=70&&c2<80)
		{
			 gp2=8;
		}
		if(c2>=60&&c2<70)
		{
			 gp2=7;
		}
		if(c2>=50&&c2<60)
		{
			 gp2=6;
		}
		if(c2>=40&&c2<50)
		{
			 gp2=5;
		}if(c2<40)
		{
			 gp2=0;
		}
		if(c3>=90&&c3<=100)
		{
			 gp3=10;
		}
		if(c3>=80&&c3<90)
		{
			 gp3=9;
		}
		if(c3>=70&&c3<80)
		{
			 gp3=8;
		}
		if(c3>=60&&c3<70)
		{
			 gp3=7;
		}
		if(c3>=50&&c3<60)
		{
			 gp3=6;
		}
		if(c3>=40&&c3<50)
		{
			 gp3=5;
		}if(c3<40)
		{
			 gp3=0;
		}
		if(c4>=90&&c4<=100)
		{
			 gp4=10;
		}
		if(c4>=80&&c4<90)
		{
			 gp4=9;
		}
		if(c4>=70&&c4<80)
		{
			 gp4=8;
		}
		if(c4>=60&&c4<70)
		{
			 gp4=7;
		}
		if(c4>=50&&c4<60)
		{
			 gp4=6;
		}
		if(c4>=40&&c4<50)
		{
			 gp4=5;
		}if(c4<40)
		{
			 gp4=0;
		}
		if(c5>=90&&c5<=100)
		{
			 gp5=10;
		}
		if(c5>=80&&c5<90)
		{
			 gp5=9;
		}
		if(c5>=70&&c5<80)
		{
			 gp5=8;
		}
		if(c5>=60&&c5<70)
		{
			 gp5=7;
		}
		if(c5>=50&&c5<60)
		{
			 gp5=6;
		}
		if(c5>=40&&c5<50)
		{
			 gp5=5;
		}if(c5<40)
		{
			 gp5=0;
		}
		if(c6>=90&&c6<=100)
		{
			 gp6=10;
		}
		if(c6>=80&&c6<90)
		{
			 gp6=9;
		}
		if(c6>=70&&c6<80)
		{
			 gp6=8;
		}
		if(c6>=60&&c6<70)
		{
			 gp6=7;
		}
		if(c6>=50&&c6<60)
		{
			 gp6=6;
		}
		if(c6>=40&&c6<50)
		{
			 gp6=5;
		}if(c6<40)
		{
			 gp6=0;
		}
		int cgpa = ((7*gp1)+(3*gp2)+(5*gp3)+(4*gp4)+(4*gp5)+(1*gp6))/24;
		System.out.println("GPA: "+cgpa);
	}
}