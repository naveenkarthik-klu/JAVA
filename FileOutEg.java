import java.io.*;
public class FileOutEg {
public static void main ( String args []){
try {
FileOutputStream fout = new FileOutputStream ("F:\\Java\\Manual programs\\testout.txt");
fout.write(66);
fout.close();
System.out.println (" success ...");
} catch ( Exception e){ System . out . println (e);}
}
}