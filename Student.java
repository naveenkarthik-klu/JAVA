import java.io.*;
import java.util.*;
class Student
{
public static void main(String arg[])
{
 Scanner sc = new Scanner(System.in);
 int role_no=1201;



 System.out.println("Enter your role number");
 int rnum = sc.nextInt();
 if(rnum==role_no)
 {
	 System.out.println("Your mark: eng-180,tam-180,mat-190");
 }
 else
 {
	 System.out.println("Enter your role number correctly....");
 }
}
}
