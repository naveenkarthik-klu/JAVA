import java.io.*;
class UserInputInteger
{
	public static void main(String ar[]) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int num;
		System.out.println("Enter a number");
		num = Integer.parseInt(in.readLine());
		System.out.println(num);
	}
}