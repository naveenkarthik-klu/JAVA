class NewThread1 extends Thread
{
NewThread1()
{
super("Demo thread");
System.out.println("Child thread "+this);
start();
}
public void run()
{
try
{
for(int i=5;i>0;i--)
{
System.out.println("Child Thread "+i);
Thread.sleep(800);
}}
catch(InterruptedException e)
{
System.out.println("Child Interrupted");
}
System.out.println("Exiting Child Thread");
}}

public class ExtendThread
{
public static void main(String ar[])
{
new NewThread1();
try
{
for(int i=6;i>0;i--)
{
System.out.println("Main Thread "+i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println("Main Thread Interrupted");
}
System.out.println("Main Thread exiting");
}
}

