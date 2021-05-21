class SavingsAccount
{
	public static float annir;
	public float savbal;
	public float monint;
	public SavingsAccount(float sab)
	{
		this.savbal=sab;
	}
	public void CalMonint()
	{
		this.monint=(savbal+annir)/12;
		System.out.println("The monthly interest is "+this.monint);
	}
	public void monIntRate(float ir)
	{
		annir=ir;
	}
	public void calcsav(float inter)
	{
		savbal+=this.monint+inter;
	}
	public void dispSav()
	{
		System.out.println("The total balance is "+savbal);
	}
}
class TestClass
{
	public static void main(String args[])
	{
		SavingsAccount s = new SavingsAccount((float)5000);
		s.annir=(float)0.25;
		s.calcsav(4);
		s.CalMonint();
		s.dispSav();
	}
}