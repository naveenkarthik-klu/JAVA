class A
{
	int i,j,k;
	void showij()
	{
		System.out.println("i = "+i+" j = "+j);
		
	}
}
class B extends A
{
	int k;
	void showk()
	{
		System.out.println("k = "+k);
	}
	void sum()
	{
		System.out.println("i+j+k= "+(i+j+k));
	}
}
class SingleInh
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		a.i=10;
		a.j=20;
		System.out.println("Contents of SuperOb");
		a.showij();
		b.i=7;
		b.j=8;
		b.k=9;
		b.showk();
		System.out.println("Sum is ");
		b.sum();
	}
}