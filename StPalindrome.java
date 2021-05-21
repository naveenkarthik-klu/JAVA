import java.lang.*;
import java.util.Scanner;
class StPalindrome
{
	public static void main(String ar[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a string");
	String str = s.nextLine();
	System.out.println("Given string : "+str);
	String rev = new StringBuffer(str).reverse().toString();
	if(str.equals(rev))
	{
		System.out.println(str+" is a Palindrome");
		
	}
	else
	{
		System.out.println(str+" is not a Palindrome");
		
	}
	}
}