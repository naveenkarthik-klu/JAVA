import java.io.*;
class CopyFile
{
public static void main(String ar[]) throws IOException
{
int i;
FileInputStream fin;
FileOutputStream fout;
try
{
try
{
fin = new FileInputStream(ar[0]);
}
catch(FileNotFoundException e)
{
System.out.println("Input file not found");
return;
}
try
{
fout = new FileOutputStream(ar[1]);
}
catch(FileNotFoundException e)
{
System.out.println("Output file error");
return;
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Usage: CopyFile From To");
return;
}
try
{
	do{
		i=fin.read();
		if(i != -1)
			fout.write(i);
	}while(i != -1);
}
catch(IOException e)
{
	System.out.println("File Error");
}
fin.close();
fout.close();
}
}





