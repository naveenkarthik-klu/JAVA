import java.io.*;
import java.util.*;
class bank
{
	int s,id,pin,new1,new2,deposit,withdrawl;
	String name;
	int amount=800000;
	Scanner sc = new Scanner(System.in);
	void getdata()
	{
		
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your ID");
        id = sc.nextInt();  		
	}
    void check()
	{
	 
	 restart:while(true)
	 {
	  System.out.println("Enter your PIN");
	  pin = sc.nextInt();
	  
	  if(pin==1234)
	  {
		  System.out.println("Welcome "+name);
		  System.out.println("Your account balance is "+amount);break restart;
		  
	   }
	  else
	  {
		  System.out.println("Enter a valid PIN..");
		  continue restart;
	  }
	 }
	 }
	 void calc()
	 {
		restart:while(true) 
		{	
		  System.out.println("Deposit or withdrawl ?");
		  System.out.println("Press 1 to Deposit");
		  System.out.println("Press 2 to Withdrawl");
		  
		  s = sc.nextInt();
		  switch(s)
		  {
			  case 1:System.out.println("Enter Deposit value");
			  deposit = sc.nextInt();
			  new1=amount+deposit;
			  System.out.println("Your amount is deposited");
			  System.out.println("your new balance is "+new1);
			  break restart;
			  case 2:System.out.println("Enter Withdrawl value");
			  withdrawl=sc.nextInt();
			  new2=amount-withdrawl;
			  System.out.println("Your amount is withdrawed");
			  System.out.println("your new balance is "+new2);
			  
			  break restart;
			  
			  default:System.out.println("Enter the valid choice...");continue restart; 
	        }
	    }
	 }
}
	 class bank1
	 {
		 public static void main(String arg[])
		 {
			 restart:while(true)
			 {	 
		     bank b = new bank();
			 b.getdata();
			 b.check();
			 b.calc();
			 
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Exit?");
			 System.out.println("Press 1 to Yes");
			 System.out.println("Press 2 to No");
			 int c = sc.nextInt();
			 if(c==1)
			 {
				 break restart;
			 }
			 else
			 {
				 continue restart;
			 }
			 }
		 }
	 }









			 
