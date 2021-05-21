class Convert
{
	public static void main(String args[])
	{
		double f,c;
		c=98.0;;
		System.out.println("Celcius = "+c);
		f=(c*(9/5)+32);
		System.out.println(c+" C = "+f+" F");
		f=100.0;
		System.out.println("Fahrenheit = "+f);
		c=((f-32)*5)/9;
		System.out.println(f+" F = "+c+" C");
	}
}