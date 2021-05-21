import java.io.*;
import java.util.*;
class high
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int k;
		System.out.println("Enter number of marks");
		int n = sc.nextInt();
		int a[] = new int[10];
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter mark"+i);
			a[i]=sc.nextInt();
		}
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=n;j++)
			 {
				 if(a[i]>a[j])
				 {
					 k=a[i];
					 a[i]=a[j];
					 a[j]=k;
				 }
			 }
		 }
		 System.out.println("The mark "+a[1]+" is the highest");
		 System.out.println("He is the first rank holder");
	}
}