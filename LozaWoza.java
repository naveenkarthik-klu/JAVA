class LozaWoza
{
public static void main(String ar[])
{

int l=0;
for(int i=1;i<=110;i++)
{
if(i%3==0)
System.out.print("  coza  ");
 else if(i%5==0)
    System.out.print("  loza  ");
     else if(i%7==0)
         System.out.print("  woza  ");
        else if(i%3==0 && i%5==0)
               System.out.print(" coza-woza  ");
         else {
               System.out.print(i + " ");
}

l++;
if(l>=11){
l=0;
System.out.println();
}

}
}}
