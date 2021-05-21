import java.io.*;
class FileIO
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin = new FileInputStream("F:\\Java\\Manual programs\\file1.txt");
		int n = fin.available();
		char ch;
		System.out.println("Contents of file :");
		for(int i=0;i<n;i++)
		{
			ch=(char)fin.read();
			System.out.print(ch);
		}
		fin.close();
		//File f = new File("F:\\Java\\Manual programs\\fileout.txt");
		FileOutputStream fout = new FileOutputStream("F:\\Java\\Manual programs\\fileout.txt");
		fout.write(10);
		fout.write(20);
		fout.write(30);
		fout.close();
		System.out.println("\nWritten");
	}
}