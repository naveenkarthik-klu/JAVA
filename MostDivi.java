class DivisorClass extends Thread
{
int start,end;String name;
DivisorClass(int s,int e,String n)
{
super(n);
name=n;
start=s;
end=e;
start();
}
public void run()
{
int N;
int maxDivisors; 
       int numWithMax;  
       maxDivisors = 1;  
       numWithMax = 1;
try
{
	   for(N=start;N<=end;N++)
{
     
           int D; 
           int divisorCount; 
           
           divisorCount = 0;
           
           for ( D = 1;  D <= N;  D++ ) {  
              if ( N % D == 0 )
                 divisorCount++;
           }
           
           if (divisorCount > maxDivisors) {
              maxDivisors = divisorCount;
              numWithMax = N;
           }
  }
     	System.out.println();  
		System.out.println("Thread name : "+name);	   
	   System.out.println("Among integers between "+start+" and "+end);
	   System.out.println("The integer that has largest number of divisors is " + numWithMax);
	   System.out.println("The maximum number of divisors is " + maxDivisors);	
	   Thread.sleep(250);
}
catch(InterruptedException e)
{
System.out.println(name);
}
}
	
}
class MostDivi
{
public static void main(String ar[])
{
new DivisorClass(2,2000,"Most Divisors 1");
new DivisorClass(2001,4000,"Most Divisors 2");
new DivisorClass(4001,6000,"Most Divisors 3");
new DivisorClass(6001,8000,"Most Divisors 4");
new DivisorClass(8001,10000,"Most Divisors 5");
}
} 
