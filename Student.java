import java.util.*;
class Student 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i,n;
		int a[] = new int[10];
		double av,sum=0;
		System.out.println("Enter number of students");
		n=s.nextInt();
		System.out.println("Enter grade of each student");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum+=a[i];
		}
		av = sum/n;
		System.out.println("Average = "+av);
	}
	
}