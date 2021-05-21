class MultipCatch
{
public static void main(String ar[])
{
try
{
int a = ar.length;
System.out.println("a = "+a);
//int b = 42/a;
int c[]={ 1 };
c[42]=99;
}
catch(ArithmeticException e)
{
System.out.println(e+"\nDivide by 0");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index obb: "+e);
}
System.out.println("After try/catch blocks");
}
}