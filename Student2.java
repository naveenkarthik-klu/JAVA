import java.io.*;
import java.util.*;
class Student2
{
public static void main(String arg[])
{
 Scanner sc = new Scanner(System.in);
 int role_no=1201;
 restart:while(true)
 {	 
 System.out.println("Enter your role number");
 int rnum = sc.nextInt();
 if(rnum==role_no)
 {
	 System.out.println("Your mark : eng-180,tam-180,mat-190");
	 break restart;
 }
 else
 {
	 System.out.println("Enter your role number correctly....");
     continue restart;
 }
 }
 }
}

