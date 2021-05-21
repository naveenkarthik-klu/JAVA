class NewThread2 implements Runnable
{
Thread t;
NewThread2()
{
t=new Thread(this,"Demo Thread");
System.out.println("Child thread "+this);
t.start();
}
public void run()
{
try
{
for(int i=5;i>0;i--)
{
System.out.println("Child Thread "+i);
Thread.sleep(500);
}}
catch(InterruptedException e)
{
System.out.println("Child Interrupted");
}
System.out.println("Exiting Child Thread");
}}

public class ThreadDemo
{
public static void main(String ar[])
{
new NewThread2();
try
{
for(int i=6;i>0;i--)
{
System.out.println("Main Thread "+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println("Main Thread Interrupted");
}
System.out.println("Main Thread exiting");
}
}

