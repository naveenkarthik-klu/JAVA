class FiveThread extends Thread
{
	FiveThread()
	{
		//super("Demo thread");
		//System.out.println("Child Thread : "+this);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=10;i>0;i--)
			{
				System.out.println("Child Thread "+i);
				Thread.sleep(525);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child thread interrupted");
		}
		System.out.println("Exiting Child Thread");
	}
}
class MyThread 
{
	public static void main(String args[])
	{
		new FiveThread();
		try
		{
			for(int i=10;i>0;i--)
			{
				System.out.println("Main Thread "+i);
				Thread.sleep(850);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child thread interrupted");
		}
		System.out.println("Exiting Main Thread");
	}
}