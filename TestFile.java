import java.io.*;
class TestFile
{
	public static void main(String arp[])
	{
		
		try
		{
			int j=1;
			char ch;
			FileInputStream fin = new FileInputStream("F:\\9918004080\\file1.txt");
			 System.out.println("\nContents of the file are");
                        int n=fin.available();
                        System.out.print(j+": ");
                        for(int i=0;i<n;i++)
                        {
                                    ch=(char)fin.read();
                                    System.out.print(ch);
                                    if(ch=='\n')
                                    {
                                                System.out.print(++j+": ");
                                               
                                    }
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
