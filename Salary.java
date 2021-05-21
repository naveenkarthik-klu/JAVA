import java.util.*;
class Employee
{
	String name;
	int id;
	String addr,mailid,mobnum;
	Scanner sc = new Scanner(System.in);

void getdata()
{
	System.out.println("Enter name of the employee");
	name = sc.next();
	System.out.println("Enter employee id");
	id=sc.nextInt();
	System.out.println("Enter address");
	addr=sc.next();
	System.out.println("Enter Mail ID");
	mailid=sc.next();
	System.out.println("Enter mobile number");
	mobnum=sc.next();
}    	
void display()
{
	System.out.println("Employee name "+name);
	System.out.println("Employee ID "+id);
	System.out.println("Address "+addr);
	System.out.println("Mail ID "+mailid);
	System.out.println("Mobile number "+mobnum);
}
}
class Programmer extends Employee
{
	double salary,bp,da,hra,pf,club,net,gross;
	void getProgrammer()
	{
		System.out.println("Enter basic pay");
		bp=sc.nextDouble();
		
	}
	void calcProgrammer()
	{
		da=.97*bp;
		hra=.10*bp;
		pf=.12*bp;
		club=.1*bp;
		gross=bp+da+hra;
		net=gross-pf-club;
		System.out.println("Pay slip for programmer");
		System.out.println("Basic pay "+bp);
		System.out.println("DA "+da);
		System.out.println("HRA "+hra);
		System.out.println("Club pay "+club);
		System.out.println("Gross pay "+gross);
		System.out.println("Net pay "+net);
	}
}
class AssistantProfessor extends Employee
{
	double salary,bp,da,hra,pf,club,net,gross;
	void getAssistantProf()
	{
		System.out.println("Enter basic pay");
		bp=sc.nextDouble();
		
	}
	void calcAssistantProf()
	{
		da=.97*bp;
		hra=.10*bp;
		pf=.12*bp;
		club=.1*bp;
		gross=bp+da+hra;
		net=gross-pf-club;
		System.out.println("Pay slip for Assistant Professor");
		System.out.println("Basic pay "+bp);
		System.out.println("DA "+da);
		System.out.println("HRA "+hra);
		System.out.println("Club pay "+club);
		System.out.println("Gross pay "+gross);
		System.out.println("Net pay "+net);
	}
}
class AssociateProfessor extends Employee
{
	double salary,bp,da,hra,pf,club,net,gross;
	void getAssociateProf()
	{
		System.out.println("Enter basic pay");
		bp=sc.nextDouble();
		
	}
	void calcAssociateProf()
	{
		da=.97*bp;
		hra=.10*bp;
		pf=.12*bp;
		club=.1*bp;
		gross=bp+da+hra;
		net=gross-pf-club;
		System.out.println("Pay slip for Associate Professor");
		System.out.println("Basic pay "+bp);
		System.out.println("DA "+da);
		System.out.println("HRA "+hra);
		System.out.println("Club pay "+club);
		System.out.println("Gross pay "+gross);
		System.out.println("Net pay "+net);
	}
}
class Professor extends Employee
{
	double salary,bp,da,hra,pf,club,net,gross;
	void getProfessor()
	{
		System.out.println("Enter basic pay");
		bp=sc.nextDouble();
		
	}
	void calcProfessor()
	{
		da=.97*bp;
		hra=.10*bp;
		pf=.12*bp;
		club=.1*bp;
		gross=bp+da+hra;
		net=gross-pf-club;
		System.out.println("Pay slip for Professor");
		System.out.println("Basic pay "+bp);
		System.out.println("DA "+da);
		System.out.println("HRA "+hra);
		System.out.println("Club pay "+club);
		System.out.println("Gross pay "+gross);
		System.out.println("Net pay "+net);
	}
}

class Salary
{
	public static void main(String arg[])
	{
		Programmer prog = new Programmer();
		AssistantProfessor assisprof = new AssistantProfessor();
		AssociateProfessor assoprof = new AssociateProfessor();
		Professor prof = new Professor();
		
		prog.getdata();
		prog.getProgrammer();
		prog.display();
		prog.calcProgrammer();
		
		assisprof.getdata();
		assisprof.getAssistantProf();
		assisprof.display();
		assisprof.calcAssistantProf();
		
		assoprof.getdata();
		assoprof.getAssociateProf();
		assoprof.display();
		assoprof.calcAssociateProf();
		
		prof.getdata();
		prof.getProfessor();
		prof.display();
		prof.calcProfessor();
		
	}
}	