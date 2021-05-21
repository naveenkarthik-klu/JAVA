import java.io.*;
import java.nio.file.*;
class FileOperations
{
	public static void main(String args[])
	{
		try
		{
			File f = new File("F:\\Java\\Manual programs\\file1.txt");
			if(f.exists())
			{
				System.out.println("File Exists\n");
				Path p = Paths.get("F:\\Java\\Manual programs\\file1.txt");
				boolean b = Files.isReadable(p);
				if(b) {
					System.out.println("readable");
					} 
					else {
						System.out.println("not readable");
						}
						b = Files.isWritable(p);
					if(b) {
					System.out.println("writable");
				} else {
				System.out.println("not writable");
				}
				FileInputStream fin = new FileInputStream("F:\\Java\\Manual programs\\file1.txt");
				
				int i = 0;
				System.out.println("\nContents in file :\n");
				while((i=fin.read())!=-1)
				{
					System.out.print((char)i);
				}
				System.out.println("\n\nFile Size in bytes : "+f.length()); 
				fin.close();
			}
			else
			{
				System.out.println("File does not exists");			
			}
			
		}
		catch(IOException e)
		{
			System.out.print("\n"+e);
		}
	}
}