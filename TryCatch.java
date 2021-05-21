class TryCatch {
public static void main ( String args []) {


try 
{
int a =0;
System . out . println ("a = " + a );
int b = 42 / a;
} 

catch ( ArithmeticException e) 
{
System . out . println (" Divide by 0: " + e );
}


System . out . println (" After try / catch blocks ." );
}
}