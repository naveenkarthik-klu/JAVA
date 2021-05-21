import java.io.*;
class BBReadLines
{
	public static void main(String ar[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter lines of text");
		System.out.println("Enter 'stop' to quit");
		do
		{
			str=br.readLine();
			System.out.println("Given line : "+"'"+str+"'");
			
		}while(!str.equals("stop"));
    }
}