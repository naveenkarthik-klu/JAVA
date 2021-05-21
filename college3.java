import java.io.*;
import java.util.*;
class college3 
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		restart2:while(true)
		{
		int total,cutoff,total1;
		
		
		System.out.println("Enter marks");
		System.out.println("Physics mark-");
		int phy = sc.nextInt();                                                          
		System.out.println("Chemistry mark-");
		int che = sc.nextInt();
		System.out.println("Maths mark-");
		int mat = sc.nextInt();
		System.out.println("1.Biology");
		System.out.println("2.Computer Science");
		int a =sc.nextInt();
		if(a==2)
		{
			System.out.println("CS mark-");
			int cs = sc.nextInt();
			total1=phy+che+mat+cs;
			total=(phy+che)/4;
			cutoff=total+(mat/2);
		}
		else
		{
			System.out.println("Biology mark-");
			int bio = sc.nextInt();
			total1=phy+che+bio+mat;
			total=(phy+che)/4;
			cutoff=total+(mat/2);
		}
		if(cutoff>170)
		{
			if(cutoff<=180)
			{
			System.out.println("Welcome ");
			System.out.println("Total mark- "+total1);
			System.out.println("Cutoff- "+cutoff);
			
			
			
			restart3:while(true)
			{
			System.out.println("Select the college");
			System.out.println("1.A");
			System.out.println("2.B");
			System.out.println("3.C");
			System.out.println("Press 1 to select the college A");
			System.out.println("Press 2 to select the college B");
			System.out.println("Press 3 to select the college C");
			int b = sc.nextInt();
			switch(b)
			{
				case 1:System.out.println("Number of seats available:");
	    System.out.println("CS-47");
	    System.out.println("IT-77");
	    System.out.println("Press 1 to book seat for CS");
	    System.out.println("Press 2 to book seat for IT");
		System.out.println("Press 3 to select other college");
		System.out.println("Press 4 to exit");
	    int c = sc.nextInt();
		if(c==4)
{
 break restart2;
}
		if(c==3)
		{
			continue restart3;
		}
		if(c==1)
	    {
		 System.out.println("For CS");
		 System.out.println("Total fees to be paid:250000rs per year");
		 System.out.println("1 to CONFIRM");
	     System.out.println("2 to Cancel");
	     
		}
	    if(c==2)
	    {
		System.out.println("For IT");
		System.out.println("Total fees to be paid:150000rs per year");
		System.out.println("1 to CONFIRM");
	    System.out.println("2 to Cancel");
	    
	    }
		int d = sc.nextInt();
		if(d==1)
		{
			System.out.println("Your seat has been confirmed...");
		    System.out.println("Please pay the fees on or before ------");break restart2;
		}
		else
		{
			continue restart2;
		}
	
		case 2:System.out.println("Number of seats available:");
	    System.out.println("Civil-47");
	    System.out.println("Arch-77");
	    System.out.println("Press 1 to book seat for Civil");
	    System.out.println("Press 2 to book seat for Arch");
	    System.out.println("Press 3 to select other college");
		System.out.println("Press 4 to exit");
		int e = sc.nextInt();
		if(e==4)
{
 break restart2;
}
		if(e==3)
		{
			continue restart3;
		}
		if(e==1)
	    {
		 System.out.println("For Civil");
		 System.out.println("Total fees to be paid:250000rs per year");
		 System.out.println("1 to CONFIRM");
	     System.out.println("2 to Cancel");
	     
		}
	    if(e==2)
	    {
		System.out.println("For Arch");
		System.out.println("Total fees to be paid:150000rs per year");
		System.out.println("1 to CONFIRM");
	    System.out.println("2 to Cancel");
	    
	    }
		int f = sc.nextInt();
		if(f==1)
		{
			System.out.println("Your seat has been confirmed...");
		    System.out.println("Please pay the fees on or before ------");break restart2;
		}
		else
		{
			continue restart2;
		}
		   case 3:System.out.println("Number of seats available:");
	    System.out.println("BBA-47");
	    System.out.println("MBA-77");
	    System.out.println("Press 1 to book seat for BBA");
	    System.out.println("Press 2 to book seat for MBA");
	    System.out.println("Press 3 to select other college");
		System.out.println("Press 4 to exit");
		int g = sc.nextInt();

if(g==4)
{
 System.exit(0);
}		if(g==3)
		{
			continue restart3;
		}
		if(g==1)
	    {
		 System.out.println("For BBA");
		 System.out.println("Total fees to be paid:250000rs per year");
		 System.out.println("1 to CONFIRM");
	     System.out.println("2 to Cancel");
	     
		}
	    if(g==2)
	    {
		System.out.println("For MBA");
		System.out.println("Total fees to be paid:150000rs per year");
		System.out.println("1 to CONFIRM");
	    System.out.println("2 to Cancel");
	    
	    }
		int h = sc.nextInt();
		if(h==1)
		{
			System.out.println("Your seat has been confirmed...");
		    System.out.println("Please pay the fees on or before ------");break restart2;
		}
		else
		{
			continue restart2;
		}
		  default:System.out.println("Select valid college");continue restart3;
		}
		}
		}
		
		
		if(cutoff>180)
		{
			if(cutoff<=190)
			{
			System.out.println("Welcome ");
			System.out.println("Total mark- "+total1);
			System.out.println("Cutoff- "+cutoff);
			
			
			
			restart4:while(true)
			{
			System.out.println("Select the college");
			System.out.println("1.A");
			System.out.println("2.B");
			System.out.println("3.C");
			System.out.println("Press 1 to select the college A");
			System.out.println("Press 2 to select the college B");
			System.out.println("Press 3 to select the college C");
			
			int b = sc.nextInt();
			switch(b)
			{
				case 1:System.out.println("Number of seats available:");
	    System.out.println("B.Sc Maths-47");
	    System.out.println("B.Sc Physics-77");
	    System.out.println("Press 1 to book seat for B.Sc Maths");
	    System.out.println("Press 2 to book seat for B.Sc Physics");
		System.out.println("Press 3 to select other college");
		System.out.println("Press 4 to exit");
	    int c = sc.nextInt();
if(c==4)
{
 System.exit(0);
}
		if(c==3)
		{
			continue restart4;
		}
		if(c==1)
	    {
		 System.out.println("For B.Sc Maths");
		 System.out.println("Total fees to be paid:250000rs per year");
		 System.out.println("1 to CONFIRM");
	     System.out.println("2 to Cancel");
	     
		}
	    if(c==2)
	    {
		System.out.println("For B.Sc Physics");
		System.out.println("Total fees to be paid:150000rs per year");
		System.out.println("1 to CONFIRM");
	    System.out.println("2 to Cancel");
	    
	    }
		int d = sc.nextInt();
		if(d==1)
		{
			System.out.println("Your seat has been confirmed...");
		    System.out.println("Please pay the fees on or before ------");break restart2;
		}
		else
		{
			continue restart2;
		}
	
		case 2:System.out.println("Number of seats available:");
	    System.out.println("B.Sc Chemistry-47");
	    System.out.println("B.Sc Cs-77");
	    System.out.println("Press 1 to book seat for B.Sc Chemistry");
	    System.out.println("Press 2 to book seat for B.Sc Cs");
	    System.out.println("Press 3 to select other college");
		System.out.println("Press 4 to exit");
		int e = sc.nextInt();
if(e==4)
{
 System.exit(0);
}
		if(e==3)
		{
			continue restart4;
		}
		if(e==1)
	    {
		 System.out.println("For B.Sc Chemistry");
		 System.out.println("Total fees to be paid:250000rs per year");
		 System.out.println("1 to CONFIRM");
	     System.out.println("2 to Cancel");
	     
		}
	    if(e==2)
	    {
		System.out.println("For B.Sc Cs");
		System.out.println("Total fees to be paid:150000rs per year");
		System.out.println("1 to CONFIRM");
	    System.out.println("2 to Cancel");
	    
	    }
		int f = sc.nextInt();
		if(f==1)
		{
			System.out.println("Your seat has been confirmed...");
		    System.out.println("Please pay the fees on or before ------");break restart2;
		}
		else
		{
			continue restart2;
		}
		   case 3:System.out.println("Number of seats available:");
	    System.out.println("BA English-47");
	    System.out.println("BA Tamil-77");
	    System.out.println("Press 1 to book seat for BA English");
	    System.out.println("Press 2 to book seat for BA Tamil");
	    System.out.println("Press 3 to select other college");
		System.out.println("Press 4 to exit");
		int g = sc.nextInt();
if(g==4)
{
 System.exit(0);
}
		if(g==3)
		{
			continue restart4;
		}
		if(g==1)
	    {
		 System.out.println("For BA English");
		 System.out.println("Total fees to be paid:250000rs per year");
		 System.out.println("1 to CONFIRM");
	     System.out.println("2 to Cancel");
	     
		}
	    if(g==2)
	    {
		System.out.println("For BA Tamil");
		System.out.println("Total fees to be paid:150000rs per year");
		System.out.println("1 to CONFIRM");
	    System.out.println("2 to Cancel");
	    
	    }
		int h = sc.nextInt();
		if(h==1)
		{
			System.out.println("Your seat has been confirmed...");
		    System.out.println("Please pay the fees on or before ------");break restart2;
		}
		else
		{
			continue restart2;
		}
		  default:System.out.println("Select valid college");continue restart4;
		}
		}
		}
		else
		
		if(cutoff>190)
		{
		System.out.println("Welcome ");
			System.out.println("Total mark- "+total1);
			System.out.println("Cutoff- "+cutoff);
			
			
			
			restart5:while(true)
			{
			System.out.println("Select the college");
			System.out.println("1.A");
			System.out.println("2.B");
			System.out.println("3.C");
			System.out.println("Press 1 to select the college A");
			System.out.println("Press 2 to select the college B");
			System.out.println("Press 3 to select the college C");
			int b = sc.nextInt();
			switch(b)
			{
				case 1:System.out.println("Number of seats available:");
	    System.out.println("BE Robotic Engineering-47");
	    System.out.println("BE Genetic Engineering-77");
	    System.out.println("Press 1 to book seat for BE Robotic Engineering");
	    System.out.println("Press 2 to book seat for BE Genetic Engineering");
		System.out.println("Press 3 to select other college");
		System.out.println("Press 4 to exit");
	    int c = sc.nextInt();
if(c==4)
{
 System.exit(0);
}
		if(c==3)
		{
			continue restart5;
		}
		if(c==1)
	    {
		 System.out.println("For BE Robotic Engineering");
		 System.out.println("Total fees to be paid:250000rs per year");
		 System.out.println("1 to CONFIRM");
	     System.out.println("2 to Cancel");
	     
		}
	    if(c==2)
	    {
		System.out.println("For BE Genetic Engineering");
		System.out.println("Total fees to be paid:150000rs per year");
		System.out.println("1 to CONFIRM");
	    System.out.println("2 to Cancel");
	    
	    }
		int d = sc.nextInt();
		if(d==1)
		{
			System.out.println("Your seat has been confirmed...");
		    System.out.println("Please pay the fees on or before ------");break restart2;
		}
		else
		{
			continue restart2;
		}
	
		case 2:System.out.println("Number of seats available:");
	    System.out.println("BE Aeronautical Engineering-47");
	    System.out.println("ME-77");
	    System.out.println("Press 1 to book seat for BE Aeronautical Engineering");
	    System.out.println("Press 2 to book seat for BE Chemical Engineering");
	    System.out.println("Press 3 to select other college");
		System.out.println("Press 4 to exit");
		int e = sc.nextInt();
		if(e==4)
{
 System.exit(0);
}
		if(e==3)
		{
			continue restart5;
		}
		if(e==1)
	    {
		 System.out.println("For BE Aeronautical Engineering");
		 System.out.println("Total fees to be paid:250000rs per year");
		 System.out.println("1 to CONFIRM");
	     System.out.println("2 to Cancel");
	     
		}
	    if(e==2)
	    {
		System.out.println("For BE Chemical Engineering");
		System.out.println("Total fees to be paid:150000rs per year");
		System.out.println("1 to CONFIRM");
	    System.out.println("2 to Cancel");
	    
	    }
		int f = sc.nextInt();
		if(f==1)
		{
			System.out.println("Your seat has been confirmed...");
		    System.out.println("Please pay the fees on or before ------");break restart2;
		}
		else
		{
			continue restart2;
		}
		   case 3:System.out.println("Number of seats available:");
	    System.out.println("BE Electrical and Electronic Enginnering-47");
	    System.out.println("BE Mechanical Engineering-77");
	    System.out.println("Press 1 to book seat for BE Electrical and Electronic Enginnering");                 
	    System.out.println("Press 2 to book seat for BE Mechanical Engineering");
	    System.out.println("Press 3 to select other college");
		System.out.println("Press 4 to exit");
		int g = sc.nextInt();
if(g==4)
{
 System.exit(0);
}
		if(g==3)
		{
			continue restart5;
		}
		if(g==1)
	    {
		 System.out.println("For BE Electrical and Electronic Enginnering");
		 System.out.println("Total fees to be paid:250000rs per year");
		 System.out.println("1 to CONFIRM");
	     System.out.println("2 to Cancel");
	     
		}
	    if(g==2)
	    {
		System.out.println("For BE Mechanical Engineering");
		System.out.println("Total fees to be paid:150000rs per year");
		System.out.println("1 to CONFIRM");
	    System.out.println("2 to Cancel");
	    
	    }
		int h = sc.nextInt();
		if(h==1)
		{
			System.out.println("Your seat has been confirmed...");
		    System.out.println("Please pay the fees on or before ------");break restart2;
		}
		else
		{
			continue restart2;                                               
		}
		  default:System.out.println("Select valid college");continue restart5;
		}
		}	
		}
		
		
		}
		}
		else
		{
			System.out.println("Welcome ");
			System.out.println("Total mark- "+total1);
			System.out.println("Cutoff- "+cutoff);
			System.out.println("Cut off marks must be greater than 170 for this .......");
			System.out.println("Press 1 to continue and 2 to exit");
		int k = sc.nextInt();
		if(k==1)
		{
		continue restart2;	
		}
		else
		{
			break restart2;
		}
			
		}
		
	}
	}
}
