class PrimeClass extends Thread
{
int start,end;String name;
PrimeClass(int s,int e,String n)
{
super(n);
name=n;
start=s;
end=e;
start();
}
public void run()
{
int i,j,f=0;
for(i=start;i<=end;i++)
{
try
{
f=0;
for(j=2;j<=i-1;j++)
{
if(i%j==0)
{
f=1;break;
}

}

if(f==0)
{
System.out.println("Current Thread : "+name);
System.out.println(i);
Thread.sleep(100);
}
}
catch(InterruptedException e)
{
System.out.println(name);
}
	
}
}
}
class TestPr
{
public static void main(String ar[])
{
new PrimeClass(100,200,"First Thread");
new PrimeClass(201,300,"Second Thread");
new PrimeClass(301,400,"Third Thread");
new PrimeClass(401,500,"Fourth Thread");
}
} 
