import java.io.*;
import java.util.*;
class std
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
	    int rnum,phy_mark,che_mark,mat_mark;
		System.out.println("Enter your role number...");
		rnum=sc.nextInt();
		System.out.println("Physics Mark:");
		phy_mark=sc.nextInt();
		System.out.println("Chemistry Mark:");
		che_mark=sc.nextInt();	
		System.out.println("Maths Mark:");
        mat_mark=sc.nextInt(); 
		int total=phy_mark+che_mark+mat_mark;
		int average=total/3;
		if(total>500)
		if(average>175)
		{
			System.out.println("Total:"+total+" Average:"+average);
			System.out.println("A Grade");
			
		}
			else
			{
			 System.out.println("Total:"+total+" Average:"+average);
			 System.out.println("B Grade");
			}
		else
        {
			System.out.println("Total:"+total+" Average:"+average);
			System.out.println("Should attain more marks...");
		}			
		}
		}
}		
