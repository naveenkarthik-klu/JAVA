class Stack<E>
{
E a[];
int top;
Stack()
{
a=(E[])new Object[100];
top=-1;
}
void push(E data)
{
a[++top]=data;
}
E pop()
{
return a[top--];
}
boolean hasElements()
{
return top!=-1;
}
 
}
class GenericStack
{
public static void main(String arg[])
{
Stack<Integer> si=new Stack<Integer>();  
Stack<Double> sd=new Stack<Double>();  
Stack<Student> ss=new Stack<Student>();
si.push(10);
si.push(20);
si.push(30);
 
sd.push(1.2);
sd.push(2.34);
sd.push(56.789);
sd.push(0.15);
 
ss.push( new Student("himani",2) );
ss.push( new Student("vivek",3) );
ss.push( new Student("yashovardhan",7) );
ss.push( new Student("raveena",5) );
 
System.out.println("\nintegers...");
while(si.hasElements())
{
System.out.println(si.pop());
}
 
System.out.println("\ndoubles...");
while(sd.hasElements())
{
System.out.println(sd.pop());
}
 
System.out.println("\nstudents...");
while(ss.hasElements())
{
System.out.println(ss.pop());
}
}
}
 
class Student
{
String name;
int standard;
Student(String n,int s)
{
name=n;
standard=s;
}
public String toString()
{
return name+" "+standard;
}
}