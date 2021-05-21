import java.io.*;
import java.util.*;
class Calculate
{
	int phy,che,mat,total,average;
	void markadd()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name.. ");
		String n = sc.nextLine();
		System.out.println("Phy mark:");
		phy = sc.nextInt();
		System.out.println("Che mark:");
		che = sc.nextInt();
		System.out.println("Math mark:");
		mat = sc.nextInt();
	    total=phy+che+mat;
		average=total/3;
	}
	void view()
	{
		System.out.println("Total: "+total);
		System.out.println("Average: "+average);
	}
}
class Execute 
{
	public static void main(String arg[])
	{
		Calculate r=new Calculate();
		r.markadd();
		r.view();
	}
}		
