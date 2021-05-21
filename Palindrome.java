class Palindrome
{
	public static void main(String args[])
	{
		int n= 354,rev=0;
		int t = n;
		while(n>0)
		{
			rev=(rev*10)+(n%10);
			n=n/10;
		}	
		System.out.println("Given number is "+t);
		if(rev==t)
			System.out.println("Palindrome number");
		else
			System.out.println("Not a palindrome number");
		
	}
}