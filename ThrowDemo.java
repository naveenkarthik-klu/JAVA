class ThrowDemo
{
static void throwOne() throws IllegalAccessException
{
System.out.println("Inside throwOne");
throw new IllegalAccessException("demo");
}
public static void main(String arg[])
{
try
{
throwOne();
}
catch(IllegalAccessException e)
{
System.out.println("Caught "+e);
}
}
}
