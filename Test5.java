class Exc0 extends Exception {}
class Exc1 extends Exc0 {}
public class Test5
{
	public static void main(String arg[])
	{
		try
		{
			throw new Exc1();
		}
		catch(Exc0 e0)
		{
			System.out.println("Ex0 caught");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}	
