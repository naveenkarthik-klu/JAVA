class ThrowDemo22
{
static void demoproc()
{
try
{
throw new NullPointerException("demo");
}
catch(NullPointerException e)
{
System.out.println("Caught inside demoproc");
throw e;
}
}
public static void main(String ar[])
{
try
{
demoproc();
}
catch(NullPointerException e)
{
System.out.println("recaught "+e);
}
}
}