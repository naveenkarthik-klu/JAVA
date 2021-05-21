import java.io.*; 
import java.util.Scanner;
class BinaryConv 
{ 
	static void decToBinary(int n) 
	{ 
		int[] b = new int[1000]; 

		int i = 0; 
		while (n > 0) 
		{ 
			b[i] = n % 2; 
			n = n / 2; 
			i++; 
		} 

		for (int j = i - 1; j >= 0; j--) 
			System.out.print(b[j]); 
	} 
	
	public static void main (String[] args) 
	{ 
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter a decimal number");
		n=s.nextInt();
		System.out.println("Binary form of given number is");
		decToBinary(n); 
	} 
} 
