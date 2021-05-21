import java.io.*;
import java.util.*;
public interface one
	{
		int amount=80000;
	    
	}


class Main 
{
	int deposit;
		int withdrawl;
		String name;
	
	void get()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        name = sc.nextLine();
        
		
	}
	void check()
	{
		restart:while(true)
		{
			System.out.println("Pin ");		
		    int pin = sc.nextInt();
			
		}
		
		if(pin==1234)
		{
			System.out.println("Your current balance is "+amount);
			break restart;
		}
		else
		{
			System.out.println("Enter valid pin...");
			continue restart;
		}
		}
		void calc()
		{
			restart:while(true) 
		{	
		  System.out.println("Deposit or withdrawl ?");
		  System.out.println("1.Deposit");
		  System.out.println("2.Withdrawl");
		  
		  int s = sc.nextInt();
		  switch(s)
		  {
			  case 1:System.out.println("Enter Deposit value");
			  deposit = sc.nextInt();
			  int new1=amount+deposit;
			  System.out.println("Your amount is deposited");
			  System.out.println("your new balance is "+new1);
			  break restart;
			  case 2:System.out.println("Enter Withdrawl value");
			  withdrawl=sc.nextInt();
			  int new2=amount-withdrawl;
			  System.out.println("Your amount is withdrawed");
			  System.out.println("your new balance is "+new2);
			  
			  break restart;
			  
			  default:System.out.println("Enter the valid choice...");continue restart;
		  }
		}
		}
		
}
class Bank
{
	public static void main(String arg[])
	{
		Main m = new Main();
        m.get();
        m.check();
        m.calc();		
	}
}