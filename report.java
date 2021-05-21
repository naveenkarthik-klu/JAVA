import java.io.*;
import java.util.*;
class report
{
	public static void main(String arg[])
	{	
		    restart:while(true)
			{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name ");
			String name = sc.nextLine();
			System.out.println("Enter marks");
			System.out.println("English mark-");
			int eng = sc.nextInt();
			System.out.println("Tamil mark-");
			int tam = sc.nextInt();
			System.out.println("Maths mark-");
			int mat = sc.nextInt();
			System.out.println("Science mark-");
			int scie = sc.nextInt();
			System.out.println("Social Science mark-");
			int ss = sc.nextInt();
			int total = eng+tam+mat+scie+ss;
			int percent = (eng+tam+mat+scie+ss)/5;
			if(percent>60)
			{
				System.out.println("Name- "+name);
				System.out.println("Total- "+total);
				System.out.println("Percentage- "+percent);
				System.out.println("Result- Pass");
				
			}
			else
			{
				System.out.println("Name- "+name);
				System.out.println("Total- "+total);
				System.out.println("Percentage- "+percent);
				System.out.println("Result- Fail");
			}
		    System.out.println("Press 1 to continue\n2 to exit");
            int c = sc.nextInt();
            if(c==1)
            {
				continue restart;
			}				
			else
			{
				break restart;
			}
			}
		} 		
	}
