import java.io.*;
import java.util.*;
class Voter
{
 public static void main(String arg[])
 {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter your age:");
    int age = sc.nextInt();
  if(age>=18)
  {
   System.out.println("You are eligible");  
   }
   else
   {
   System.out.println("You are not eligible");
   }
  } 
}