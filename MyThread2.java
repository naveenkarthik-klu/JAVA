class FiveThread2 implements Runnable
{
	//Thread t;
	FiveThread2()
	{
		Thread t = new Thread(this,"Demo Thread");
		t.start();
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
class MyThread2 
{
	public static void main(String args[])
	{
		new FiveThread2();
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