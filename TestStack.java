class Stack
{
int s[]=new int[50];
int t;
Stack()
{
t=-1;
}
void push(int i)
{
if(t==9)
	System.out.println("Stack is full");
else
    s[++t]=i;          	
}
int pop()
{
if(t<0)
{
System.out.println("Stack underflow");
return 0;
}
else
{
return (s[t--]);
}
}
}
class TestStack
{
public static void main(String args[])
{
Stack st1=new Stack();
Stack st2=new Stack();
for(int i=0;i<10;i++)
{
st1.push(i);
}
System.out.println("Stack in mystack 1");
for(int i=0;i<10;i++)
{
System.out.println(st1.pop());
}
for(int i=10;i<20;i++)
{
st2.push(i);
}

System.out.println("Stack in mystack 2");
for(int i=0;i<10;i++)
{
System.out.println(st2.pop());
}

}
}