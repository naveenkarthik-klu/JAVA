import java.util.Scanner;
class IntSum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integers");
		int a[]=new int [5],i;
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Given integers : ");
		for(i=0;i<5;i++)
		{
			System.out.print(a[i]+",");
		}
		int s=0;
		for(i=0;i<5;i++)
		{
			s=s+a[i];
		}
		System.out.println("\nSum of given integers is : "+s);
	}
}