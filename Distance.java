import java.util.Scanner;
class Distance
{
	public static void main(String args[])
	{
		float m,cm,km;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter distance in centimeter ");
		cm=s.nextFloat();
		m=cm/100;
		km=cm/100000;
		System.out.println("The distance in meter is "+m);
        System.out.println("The distance in kilometer is "+km);	
	}
}