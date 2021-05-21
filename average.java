import java.io.*;
import java.util.*;
class average
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[10];
		int i,sum,avg;
		System.out.println("\tSum and Average");
		System.out.println("Enter Marks");
		sum=0;
		for(i=1;i<=6;i++)
		{
			System.out.println("Mark"+i+"-");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=sum/6;
		System.out.println("Sum and average of given marks is "+sum+" and "+avg);
	}
}