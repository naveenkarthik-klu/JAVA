import java.util.Scanner;
public class nptel{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];   
      
	 for(i=0;i<arr.length;i++)
	  {
        	arr[i]=input.nextInt();
	  } 
	  int j,k,sum=0;
for(i=1;i<s;i++)
{
for(j=1;j<s;j++)
{
if(arr[i]>arr[j])
				 {
					 k=arr[i];
					 arr[i]=arr[j];
					 arr[j]=k;
				 }}
} 
result=arr[1];
for(i=0;i<s;i++)
{
sum=sum+arr[i];
}
mark_avg=sum/s;
System.out.println(result);
System.out.println(mark_avg);
	}
}