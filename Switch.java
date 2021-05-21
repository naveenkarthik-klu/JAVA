import java.io.*;
import java.util.*;
class Switch
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		restart:while(true) 
		{	
		  System.out.println("Enter your choice:");
		  System.out.println("1.One");
		  System.out.println("2.Two");
		  System.out.println("3.Three");
		  int c = sc.nextInt();
		  switch(c)
		  {
			  case 1:System.out.println("One");break restart;
			  case 2:System.out.println("Two");break restart;
			  case 3:System.out.println("Three");break restart;
			  default:System.out.println("Enter the valid choice...");continue restart;
		  }
		}
	}
}