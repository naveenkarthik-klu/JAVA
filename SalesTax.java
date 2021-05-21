import java.util.Scanner;
class SalesTax
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		double pa = s.nextDouble();
		double stt = pa*0.85;
		double ctt = pa*0.025;
		double ttt = ctt +stt;
		double total = ttt+pa;
		System.out.println("The State Tax is "+stt);
	    System.out.println("The Country Tax is "+ctt);
		System.out.println("The total tax is "+ttt);
		System.out.println("The amount inc of tax is "+total);
	}
}