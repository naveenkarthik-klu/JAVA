import java.io.*;
import java.util.*;
class Voter
{
 public static void main(String arg[])
 {
  Scanner sc = new Scanner(System.in);
  int age = sc.nextInt();
  System.out.println("Enter your age:");
  if(age<=18)
  {
   System.out.println("You are not eligible");  
   }
   else
   {
   System.out.println("You are eligible");
   }
  } 