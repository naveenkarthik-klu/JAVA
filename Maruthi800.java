class Car
{
	public Car()
	{
		System.out.println("Class Car");
		
	}
	public void vehicleType()
	{
		System.out.println("Vehicle type - Car");
	}
}
class Maruthi extends Car
{
	public Maruthi()
	{
		System.out.println("Class Maruthi");
		
	}
	public void brand()
	{
		System.out.println("Brand - Maruthi");
	}
	public void speed()
	{
		System.out.println("Max : 90 km/h");
	}
}
public class Maruthi800 extends Maruthi
{
	public Maruthi800()
	{
		System.out.println("Maruthi Brand : 800");
	
	}
	public void speed()
	{
		System.out.println("Max : 80 km/h");
	}
	public static void main(String args[])
	{
		Maruthi800 ob = new Maruthi800();
		ob.vehicleType();
		ob.brand();
		ob.speed();
	}
}

